package video.youruier.com.video.presenter;

import com.lqs.fast.mvpframework.base.IClassTAG;
import com.lqs.fast.mvpframework.base.presenter.ABasePresenter;

import video.youruier.com.video.model.IShowVideoModel;
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
        return null;
    }

    @Override
    public IShowVideoView getShowVideoView() {
        return null;
    }

}
