package video.youruier.com.video.bean.vo;

import com.lqs.fast.mvpframework.base.adatpter.BaseRVAdatpter;
import com.lqs.fast.mvpframework.bean.vo.IListVO;

import java.util.List;

/**
 * Created by dell on 2016/12/1.
 */

public class ShowBannerViewVo implements IListVO {
    public static final int SHOW_BANNER_TYPE = 01000 + + BaseRVAdatpter.HEADER_VIEW_TYPE;

    private List<ShowVideoListVo> top;

    public List<ShowVideoListVo> getTop() {
        return top;
    }

    public void setTop(List<ShowVideoListVo> top) {
        this.top = top;
    }

    @Override
    public int getItemType() {
        return SHOW_BANNER_TYPE;
    }
}
