package video.youruier.com.video.model;

import com.lqs.fast.mvpframework.base.IClassTAG;
import com.lqs.fast.mvpframework.base.model.ABaseModel;
import com.lqs.fast.mvpframework.bean.vo.IListVO;

import java.util.List;

import video.youruier.com.video.presenter.IShowVideoPresenter;

/**
 * Created by dell on 2016/12/1.
 */

public class ShowVideoFragmentModel extends ABaseModel implements IShowVideoModel {
    public static final String TAG = "ShowVideoFragmentModel";

    @Override
    public String getTAG() {
        return TAG;
    }

    @Override
    public IShowVideoPresenter getShowVideoPresenter() {
        return null;
    }


    @Override
    public List<IListVO> getVoList() {
        return null;
    }

    @Override
    public void rePlaceData(String type) {

    }


}
