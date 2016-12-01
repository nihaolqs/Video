package com.lqs.fast.mvpframework.base.adatpter;

import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageView;

import com.lqs.fast.mvpframework.R;
import com.lqs.fast.mvpframework.bean.vo.IListVO;
import com.lqs.fast.mvpframework.utils.ImageUtils;
import com.lqs.fast.mvpframework.utils.UiUtils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by dell on 2016/11/23.
 */

public abstract class BaseRVAdatpter<VO extends IListVO> extends RecyclerView.Adapter<AClickRVHolder> {

    public static final int HEADER_VIEW_TYPE = 010000000000;    //HeaderView类型码

    public static final int CLICK_TYPE = 01000000000;

    public static final int LONG_CLICK_TYPE = 0100000000;

    protected IRVItemClickListener mClickListener;   //点击监听

    protected IRVItemLongClickListener mLongClickListener;  //长按点击监听

    protected List<IListVO> mVoList = new ArrayList<>();   //数据列表

    @Override
    public int getItemCount() {
        return mVoList.size();
    }   //行数

    @Override
    public AClickRVHolder onCreateViewHolder(ViewGroup parent, int viewType) {   //创建ViewHolder
        if (viewType == HEADER_VIEW_TYPE) {
            View headerViewRoot = UiUtils.inflaterLayout(R.layout.recycler_view_root);
            return new HeaderViewHolder(headerViewRoot);
        } else {
            return onCreateNoHeaderViewHolder(parent, viewType);
        }
    }

    protected abstract AClickRVHolder onCreateNoHeaderViewHolder(ViewGroup parent, int viewType);

    @Override
    public void onBindViewHolder(AClickRVHolder holder, int position) {   //Binder ViewHolder 初始化行数据
        int itemViewType = getItemViewType(position);
        if (itemViewType == HEADER_VIEW_TYPE) {
            View mHeaderView = ((HeaderVO) mVoList.get(position)).getmHeaderView();
            ((HeaderViewHolder) holder).setmHeaderView(mHeaderView);
        } else {
            onBindNoHeaderViewHolder(holder, position);
        }
    }

    protected abstract void onBindNoHeaderViewHolder(AClickRVHolder holder, int position);

    @Override
    public int getItemViewType(int position) {    //返回类型
        int itemType = mVoList.get(position).getItemType();
        return itemType;
    }

    public interface IRVItemClickListener {
        void onClick(View itemView, int posiction);
    }

    public void setClickListener(IRVItemClickListener clickListener) {
        this.mClickListener = clickListener;
    }

    public interface IRVItemLongClickListener {
        void onLongClick(View itemView, int posiction);
    }

    public void setLongClickListener(IRVItemLongClickListener longClickListener) {
        this.mLongClickListener = longClickListener;
    }

    public void addHeaderView(View headerview) {    //添加HeaderView类型的行
        HeaderVO e = new HeaderVO();
        e.setmHeaderView(headerview);
        this.mVoList.add(e);
    }

    public void addDataList(List<VO> voList) {
        this.mVoList.addAll(voList);
    }

    public void clearData() {
        this.mVoList.clear();
    }

    public int getHeaderViewCount(int posiction) {
        int count = 0;
        for (int i = 0; i < (posiction <= mVoList.size() ? posiction : mVoList.size()); i++) {
            if ((getItemViewType(i) & HEADER_VIEW_TYPE) !=0) {
                count++;
            }
        }
        return count;
    }

    class HeaderVO implements IListVO {

        private View mHeaderView;

        public View getmHeaderView() {
            return mHeaderView;
        }

        public void setmHeaderView(View mHeaderView) {
            this.mHeaderView = mHeaderView;
        }

        @Override
        public int getItemType() {
            return HEADER_VIEW_TYPE;
        }
    }

    class HeaderViewHolder extends AClickRVHolder {

        public void setmHeaderView(View mHeaderView) {

            ViewGroup parent = (ViewGroup) mHeaderView.getParent();
            if (parent != null) {
                parent.removeAllViews();
            }
            ViewGroup viewGroup = (ViewGroup) this.itemView;
            viewGroup.removeAllViews();
            viewGroup.addView(mHeaderView);
        }

        public HeaderViewHolder(View itemView) {
            super(itemView, null, null);
        }
    }

    @Override
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        if (layoutManager instanceof GridLayoutManager) {
            final GridLayoutManager gridManager = (GridLayoutManager) layoutManager;
            gridManager.setSpanSizeLookup(new GridLayoutManager.SpanSizeLookup() {
                @Override
                public int getSpanSize(int position) {
                    return (getItemViewType(position)&HEADER_VIEW_TYPE)!=0
                            ? gridManager.getSpanCount() : 1;
                }
            });
        }
    }

    @Override
    public void onViewAttachedToWindow(AClickRVHolder holder) {
        super.onViewAttachedToWindow(holder);
        ViewGroup.LayoutParams layoutParams = holder.itemView.getLayoutParams();
        if (layoutParams != null && layoutParams instanceof StaggeredGridLayoutManager.LayoutParams) {
            StaggeredGridLayoutManager.LayoutParams sglmlp = (StaggeredGridLayoutManager.LayoutParams) layoutParams;
            int position = holder.getLayoutPosition();
            sglmlp.setFullSpan((getItemViewType(position)&HEADER_VIEW_TYPE) != 0);
        }
    }
}
