package video.youruier.com.video.adatpter;

import android.view.View;

import com.lqs.fast.mvpframework.base.adatpter.AClickRVHolder;
import com.lqs.fast.mvpframework.base.adatpter.BaseRVAdatpter;

import video.youruier.com.video.R;

/**
 * Created by dell on 2016/12/2.
 */

public class TitleViewHolder extends AClickRVHolder {

    public View getmTitle() {
        return mTitle;
    }

    private final View mTitle;

    public TitleViewHolder(View itemView, BaseRVAdatpter.IRVItemClickListener clickListener, BaseRVAdatpter.IRVItemLongClickListener longClickListener) {
        super(itemView, clickListener, longClickListener);
        mTitle = itemView.findViewById(R.id.tv_titleitem_title);
    }
}
