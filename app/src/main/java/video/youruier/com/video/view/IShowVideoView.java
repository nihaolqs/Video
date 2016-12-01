package video.youruier.com.video.view;

import com.lqs.fast.mvpframework.bean.vo.IListVO;

import java.util.List;

import video.youruier.com.video.presenter.IShowVideoPresenter;

/**
 * Created by dell on 2016/12/1.
 */

public interface IShowVideoView {

    IShowVideoPresenter getShowVideoPresenter();

    void showVoList(List<IListVO> listVOs);
}
