package video.youruier.com.video.presenter;

import com.lqs.fast.mvpframework.base.IClassTAG;
import com.lqs.fast.mvpframework.base.model.ABaseModel;
import com.lqs.fast.mvpframework.base.presenter.ABasePresenter;
import com.lqs.fast.mvpframework.base.view.ABaseView;
import com.lqs.fast.mvpframework.bean.vo.IListVO;

import java.util.List;

import video.youruier.com.video.fragment.ShowVideoFragment;
import video.youruier.com.video.model.IShowVideoModel;
import video.youruier.com.video.model.ShowVideoFragmentModel;
import video.youruier.com.video.view.IShowVideoView;

/**
 * Created by dell on 2016/12/1.
 */

public class ShowVideoFragmentPresenter extends ABasePresenter implements IShowVideoPresenter {

    public static final String TAG = "ShowVideoFragmentPresenter";
    @Override
    public String getTAG() {
        return TAG;
    }

    @Override
    public IShowVideoModel getShowVideoModel() {

        ABaseModel model = getModelForTag(ShowVideoFragmentModel.TAG);
        return (IShowVideoModel) model;
    }

    @Override
    public IShowVideoView getShowVideoView() {
        ABaseView view = getViewForTag(ShowVideoFragment.TAG);
        return (IShowVideoView) view;
    }

    @Override
    public void showVideos() {
        List<IListVO> voList = getShowVideoModel().getVoList();
        IShowVideoView view = getShowVideoView();
        view.showVoList(voList);
    }

    @Override
    public void showPlayActivity(String url) {

    }

    @Override
    public void showTypeVideos(String type) {

    }

    @Override
    public void replaceData() {
        String type = getShowVideoView().getType();
        getShowVideoModel().replaceData(type);
    }

    @Override
    public void onCreate() {
        super.onCreate();
        replaceData();
    }
}
