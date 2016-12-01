package video.youruier.com.video.fragment;

import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.lqs.fast.mvpframework.base.adatpter.BaseRVAdatpter;
import com.lqs.fast.mvpframework.base.presenter.ABasePresenter;
import com.lqs.fast.mvpframework.base.view.ABaseListView;
import com.lqs.fast.mvpframework.bean.vo.IListVO;
import com.lqs.fast.mvpframework.utils.MvpUtils;

import java.util.List;

import video.youruier.com.video.R;
import video.youruier.com.video.adatpter.MyShowVideoAdatpter;
import video.youruier.com.video.model.ShowVideoFragmentModel;
import video.youruier.com.video.presenter.IShowVideoPresenter;
import video.youruier.com.video.presenter.ShowVideoFragmentPresenter;
import video.youruier.com.video.view.IShowVideoView;

/**
 * Created by dell on 2016/12/1.
 */

public class ShowVideoFragment extends ABaseListView implements IShowVideoView{
    public static final String TAG = "ShowVideoFragment";

    public static final String BUNDLE_KEY_TYPE = "bundle_key_type";
    private String mType;
    private RecyclerView mRecyclerView;
    private GridLayoutManager layoutManager;
    private MyShowVideoAdatpter mRecyclerViewAdapter;

    @Override
    public String getTAG() {
        return TAG;
    }

    @Override
    protected void initData() {
        Bundle bundle = getArguments();
        mType = bundle.getString(BUNDLE_KEY_TYPE);
    }

    @Override
    protected void initUi() {
        initFindView();
        initRecyclerView();
    }

    private void initRecyclerView() {
        layoutManager = new GridLayoutManager(getContext(), 2);
        mRecyclerView.setLayoutManager(layoutManager);
        mRecyclerView.setItemAnimator(new DefaultItemAnimator());
        mRecyclerViewAdapter = new MyShowVideoAdatpter();
        mRecyclerViewAdapter.setClickListener(new BaseRVAdatpter.IRVItemClickListener() {
            @Override
            public void onClick(View itemView, int posiction) {
                
            }
        });
        mRecyclerView.setAdapter(mRecyclerViewAdapter);
    }

    private void initFindView() {
        mRecyclerView = (RecyclerView) this.mFragmentLayout.findViewById(R.id.RV_FraShowVideo_ListVo);
    }

    @Override
    protected int getLayoutResources() {
        return R.layout.fragment_show_video;
    }

    @Override
    protected void initMVP() {
        ShowVideoFragmentPresenter presenter = new ShowVideoFragmentPresenter();
        ShowVideoFragmentModel model = new ShowVideoFragmentModel();
        MvpUtils.initMVP(model,presenter,this);
    }

    @Override
    public IShowVideoPresenter getShowVideoPresenter() {
        ABasePresenter presenter = getPresenterForTag(ShowVideoFragmentPresenter.TAG);
        return (IShowVideoPresenter) presenter;
    }



    @Override
    public void showVoList(List<IListVO> listVOs) {

    }
}
