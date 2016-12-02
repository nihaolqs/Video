package video.youruier.com.video.adatpter;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.facebook.drawee.view.SimpleDraweeView;
import com.lqs.fast.mvpframework.base.adatpter.AClickRVHolder;
import com.lqs.fast.mvpframework.base.adatpter.BaseRVAdatpter;
import com.lqs.fast.mvpframework.base.adatpter.BaseVPAdatpter;
import com.lqs.fast.mvpframework.base.ui.ABaseFragment;
import com.lqs.fast.mvpframework.bean.vo.IListVO;
import com.lqs.fast.mvpframework.utils.ImageUtils;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import video.youruier.com.video.R;
import video.youruier.com.video.bean.vo.ShowVideoListVo;

/**
 * Created by dell on 2016/12/2.代码垃圾
 */

public class BannerViewHolder extends AClickRVHolder {

    private final MyViewPageAdatpter adapter;

    private ArrayList<IListVO> mIListVOs = new ArrayList<>();

    public BannerViewHolder(View itemView, FragmentManager fm, BaseRVAdatpter.IRVItemClickListener clickListener, BaseRVAdatpter.IRVItemLongClickListener longClickListener) {
        super(itemView, clickListener, longClickListener);
        ViewPager mViewPage = (ViewPager) itemView.findViewById(R.id.vp_banneritem_banner);
        adapter = new MyViewPageAdatpter(fm);
        mViewPage.setAdapter(adapter);
    }

    public void replaceData(List<IListVO> listVOList) {
        mIListVOs.clear();
        mIListVOs.addAll(listVOList);
        adapter.notifyDataSetChanged();
    }

    private class MyViewPageAdatpter extends FragmentStatePagerAdapter {

        public MyViewPageAdatpter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {

            Bundle bundle = new Bundle();
            bundle.putSerializable(PageFragment.BUNDLE_KEY, (ShowVideoListVo) mIListVOs.get(position % mIListVOs.size()));
            try {
                Fragment fragment = ABaseFragment.getInstance(PageFragment.class, bundle);
                return fragment;
            } catch (IllegalAccessException e) {

            } catch (InstantiationException e) {
                e.printStackTrace();
            }
            return null;
        }

        @Override
        public int getCount() {
            return mIListVOs.size() * 10000;
        }
    }

    public static class PageFragment extends ABaseFragment {

        public static final String BUNDLE_KEY = "Bundle_key";

        private SimpleDraweeView mBannerImage;
        private ShowVideoListVo showVideoListVo;

        @Override
        protected void initData() {
            Bundle bundle = getArguments();
            showVideoListVo = (ShowVideoListVo) bundle.getSerializable(BUNDLE_KEY);
            ImageUtils.LoadImage(mBannerImage, showVideoListVo.getCover());
        }

        @Override
        protected void initUi() {
            mBannerImage = (SimpleDraweeView) mFragmentLayout.findViewById(R.id.banner_page_image);
        }

        @Override
        protected int getLayoutResources() {
            return R.layout.fragment_banner_page;
        }
    }
}
