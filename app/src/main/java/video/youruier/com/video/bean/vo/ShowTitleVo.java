package video.youruier.com.video.bean.vo;

import com.lqs.fast.mvpframework.base.adatpter.BaseRVAdatpter;
import com.lqs.fast.mvpframework.bean.vo.IListVO;

/**
 * Created by dell on 2016/12/1.
 */

public class ShowTitleVo implements IListVO {
    public static final int TITLE_VIEW_TYPE = 010 + BaseRVAdatpter.HEADER_VIEW_TYPE;

    private String type;
    private String title;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public int getItemType() {
        return TITLE_VIEW_TYPE;
    }
}
