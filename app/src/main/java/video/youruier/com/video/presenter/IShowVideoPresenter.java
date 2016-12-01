package video.youruier.com.video.presenter;

import video.youruier.com.video.model.IShowVideoModel;
import video.youruier.com.video.view.IShowVideoView;

/**
 * Created by dell on 2016/12/1.
 */

public interface IShowVideoPresenter {
    IShowVideoModel getShowVideoModel();

    IShowVideoView getShowVideoView();

}
