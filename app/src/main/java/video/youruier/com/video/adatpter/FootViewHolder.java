package video.youruier.com.video.adatpter;

import android.view.View;
import android.widget.TextView;

import com.lqs.fast.mvpframework.base.adatpter.AClickRVHolder;
import com.lqs.fast.mvpframework.base.adatpter.BaseRVAdatpter;

import video.youruier.com.video.R;

/**
 * Created by dell on 2016/12/2.
 */

public class FootViewHolder extends AClickRVHolder {

    private final TextView replace;

    public TextView getReplace() {
        return replace;
    }

    public FootViewHolder(View itemView, BaseRVAdatpter.IRVItemClickListener clickListener, BaseRVAdatpter.IRVItemLongClickListener longClickListener) {
        super(itemView, clickListener, longClickListener);
        replace = (TextView) itemView.findViewById(R.id.tv_footitem_replace);
    }
}
