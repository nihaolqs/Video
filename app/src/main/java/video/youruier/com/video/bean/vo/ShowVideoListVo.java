package video.youruier.com.video.bean.vo;

import com.lqs.fast.mvpframework.base.adatpter.BaseRVAdatpter;
import com.lqs.fast.mvpframework.bean.vo.IListVO;

/**
 * Created by dell on 2016/12/1.
 */

public class ShowVideoListVo implements IListVO {

    public static final int VIDEO_LIST_TYPE = 01;

    private String title;
    private String cover;
    private String uri;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCover() {
        return cover;
    }

    public void setCover(String cover) {
        this.cover = cover;
    }

    public String getUri() {
        return uri;
    }

    public void setUri(String uri) {
        this.uri = uri;
    }

    @Override
    public int getItemType() {
        return BaseRVAdatpter.CLICK_TYPE + BaseRVAdatpter.LONG_CLICK_TYPE + VIDEO_LIST_TYPE;
    }
}
