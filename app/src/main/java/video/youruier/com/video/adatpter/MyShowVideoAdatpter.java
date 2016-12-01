package video.youruier.com.video.adatpter;

import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;

import com.lqs.fast.mvpframework.base.adatpter.AClickRVHolder;
import com.lqs.fast.mvpframework.base.adatpter.BaseRVAdatpter;

/**
 * Created by dell on 2016/12/1.
 */

public class MyShowVideoAdatpter extends BaseRVAdatpter{
    @Override
    protected AClickRVHolder onCreateNoHeaderViewHolder(ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    protected void onBindNoHeaderViewHolder(AClickRVHolder holder, int position) {

    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {

    }
}
