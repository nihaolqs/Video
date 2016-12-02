package video.youruier.com.video.bean.vo;

import com.lqs.fast.mvpframework.base.adatpter.BaseRVAdatpter;
import com.lqs.fast.mvpframework.bean.vo.IListVO;

/**
 * Created by dell on 2016/12/1.
 */

public class ShowFootViewVo implements IListVO {
    public static final int SHOW_FOOT_VIEW_TYPR =  BaseRVAdatpter.HEADER_VIEW_TYPE + 0100;

    private String type;
    private String title;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public int getItemType() {
        return SHOW_FOOT_VIEW_TYPR;
    }
}
