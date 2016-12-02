package video.youruier.com.video.adatpter;

import android.view.View;
import android.widget.TextView;

import com.facebook.drawee.view.SimpleDraweeView;
import com.lqs.fast.mvpframework.base.adatpter.AClickRVHolder;
import com.lqs.fast.mvpframework.base.adatpter.BaseRVAdatpter;

import video.youruier.com.video.R;

/**
 * Created by dell on 2016/12/2.
 */

public class VideoViewHolder extends AClickRVHolder {

    public SimpleDraweeView getmSdvVideoImage() {
        return mSdvVideoImage;
    }

    public TextView getmTvVideoTitle() {
        return mTvVideoTitle;
    }

    private final SimpleDraweeView mSdvVideoImage;
    private final TextView mTvVideoTitle;

    public VideoViewHolder(View itemView, BaseRVAdatpter.IRVItemClickListener clickListener, BaseRVAdatpter.IRVItemLongClickListener longClickListener) {
        super(itemView, clickListener, longClickListener);
        mSdvVideoImage = (SimpleDraweeView) itemView.findViewById(R.id.sdv_videoitem_image);
        mTvVideoTitle = (TextView) itemView.findViewById(R.id.tv_videoitem_title);
    }
}
