package video.youruier.com.video.adatpter;

import android.support.v4.app.FragmentManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.facebook.drawee.view.SimpleDraweeView;
import com.lqs.fast.mvpframework.base.adatpter.AClickRVHolder;
import com.lqs.fast.mvpframework.base.adatpter.BaseRVAdatpter;
import com.lqs.fast.mvpframework.bean.vo.IListVO;
import com.lqs.fast.mvpframework.utils.ImageUtils;
import com.lqs.fast.mvpframework.utils.UiUtils;

import java.util.ArrayList;
import java.util.Random;

import video.youruier.com.video.R;
import video.youruier.com.video.bean.vo.ShowBannerViewVo;
import video.youruier.com.video.bean.vo.ShowFootViewVo;
import video.youruier.com.video.bean.vo.ShowTitleVo;
import video.youruier.com.video.bean.vo.ShowVideoListVo;

/**
 * Created by dell on 2016/12/1.
 */

public class MyShowVideoAdatpter extends BaseRVAdatpter {

    private IRVItemClickListener mItemClickListener;
    private FragmentManager fm;

    public MyShowVideoAdatpter(FragmentManager fm) {
        this.fm = fm;
    }


    @Override
    protected AClickRVHolder onCreateNoHeaderViewHolder(ViewGroup parent, int viewType) {
        if (viewType == ShowBannerViewVo.SHOW_BANNER_TYPE) {
            View view = UiUtils.inflaterLayout(R.layout.layout_showvideolist_banner_item);
            BannerViewHolder bannerViewHolder = new BannerViewHolder(view, fm, null, null);
            return bannerViewHolder;

        } else if (viewType == ShowTitleVo.TITLE_VIEW_TYPE) {
            View view = UiUtils.inflaterLayout(R.layout.layout_showvideolist_title_item);
            TitleViewHolder titleViewHolder = new TitleViewHolder(view, mClickListener, null);
            return titleViewHolder;

        } else if (viewType == ShowVideoListVo.VIDEO_LIST_TYPE) {

            View view = UiUtils.inflaterLayout(R.layout.layout_showvideolist_video_item);
            VideoViewHolder videoViewHolder = new VideoViewHolder(view, mItemClickListener, null);
            return videoViewHolder;

        } else if (viewType == ShowFootViewVo.SHOW_FOOT_VIEW_TYPR) {
            View view = UiUtils.inflaterLayout(R.layout.layout_showvideolist_foot_item);
            FootViewHolder footViewHolder = new FootViewHolder(view, mClickListener, null);
            return footViewHolder;
        }
        return null;
    }

    @Override
    protected void onBindNoHeaderViewHolder(AClickRVHolder holder, int position) {
        int itemViewType = getItemViewType(position);
        switch (itemViewType) {
            case ShowBannerViewVo.SHOW_BANNER_TYPE: {
                BannerViewHolder bannerViewHolder = (BannerViewHolder) holder;
                ShowBannerViewVo bannerViewVo = (ShowBannerViewVo) mVoList.get(position);
                ArrayList<IListVO> listVOs = new ArrayList<>();
                listVOs.addAll(bannerViewVo.getTop());
                bannerViewHolder.replaceData(listVOs);
            }
            break;
            case ShowTitleVo.TITLE_VIEW_TYPE: {
                TitleViewHolder titleViewHolder = (TitleViewHolder) holder;
                ShowTitleVo titleVo = (ShowTitleVo) mVoList.get(position);
                TextView title = (TextView) titleViewHolder.getmTitle();
                title.setText(titleVo.getTitle());
            }
            break;
            case ShowVideoListVo.VIDEO_LIST_TYPE : {
                VideoViewHolder videoViewHolder = (VideoViewHolder) holder;
                ShowVideoListVo videoListVo = (ShowVideoListVo) mVoList.get(position);
                TextView videoTitle = videoViewHolder.getmTvVideoTitle();
                SimpleDraweeView videoImage = videoViewHolder.getmSdvVideoImage();
                videoTitle.setText(videoListVo.getTitle());
                ImageUtils.LoadImage(videoImage,videoListVo.getCover());
            }
            break;
            case ShowFootViewVo.SHOW_FOOT_VIEW_TYPR: {
                FootViewHolder footViewHolder = (FootViewHolder) holder;
                ShowFootViewVo footViewVo = (ShowFootViewVo) mVoList.get(position);
                TextView replace = footViewHolder.getReplace();
                Random random = new Random();
                int i = random.nextInt(1000);
                replace.setText(i + "条新动态,点击刷新!");
            }
            break;
        }
    }

}
