package video.youruier.com.video.model;

import com.lqs.fast.mvpframework.base.IClassTAG;
import com.lqs.fast.mvpframework.base.model.ABaseModel;
import com.lqs.fast.mvpframework.base.presenter.ABasePresenter;
import com.lqs.fast.mvpframework.bean.vo.IListVO;
import com.lqs.fast.mvpframework.utils.GsonUtil;
import com.lqs.fast.mvpframework.utils.HttpUtil;

import java.util.ArrayList;
import java.util.List;

import video.youruier.com.video.application.Constant;
import video.youruier.com.video.bean.dto.ShowVideo;
import video.youruier.com.video.presenter.IShowVideoPresenter;
import video.youruier.com.video.presenter.ShowVideoFragmentPresenter;

/**
 * Created by dell on 2016/12/1.
 */

public class ShowVideoFragmentModel extends ABaseModel implements IShowVideoModel {
    public static final String TAG = "ShowVideoFragmentModel";
    private List<IListVO> mListVOs = new ArrayList<>();

    @Override
    public String getTAG() {
        return TAG;
    }

    @Override
    public IShowVideoPresenter getShowVideoPresenter() {
        ABasePresenter presenter = getPresenterForTag(ShowVideoFragmentPresenter.TAG);
        return (IShowVideoPresenter) presenter;
    }

    @Override
    public List<IListVO> getVoList() {
        return mListVOs;
    }

    @Override
    public void replaceData(String type) {

        GsonUtil.DownLoadedJsonListener<ShowVideo> listener = new GsonUtil.DownLoadedJsonListener<ShowVideo>() {
            @Override
            public void downLoaded(ShowVideo showVideo) {
                List<IListVO> listVOs = showVideo.transform();
                mListVOs.addAll(listVOs);
                getShowVideoPresenter().showVideos();
            }
        };
        GsonUtil.downLoadJson(Constant.Apiclient.SHOW_MAIN, ShowVideo.class,listener);

    }


}
