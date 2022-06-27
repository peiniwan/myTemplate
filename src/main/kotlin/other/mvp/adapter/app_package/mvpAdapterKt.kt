package other.mvp.adapter.app_package

/**
 * 4. 创建mvvmAcitivityKt。
这个文件用于创建Activity的模板代码，根据自己的情况，自行调整。
 */
fun mvpAdapterKt(
    applicationPackage: String?,
    name: String,
    layoutName: String,
    packageName: String
) = """
package ${packageName};

import android.widget.TextView;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.tal.publish.business.main.R;
import com.tal.publish.video.player.bean.BookVpQualityItemBean;

import java.util.List;

public class ${name}Adapter extends BaseQuickAdapter<BookVpQualityItemBean, BaseViewHolder> {

//        ${name}Adapter  mAdapter = new ${name}Adapter(mQualityItems);
//        LinearLayoutManager layoutManager = new LinearLayoutManager(getContext());
//        layoutManager.setOrientation(LinearLayoutManager.VERTICAL);
//        rvQuality.setLayoutManager(layoutManager);
//        mAdapter.bindToRecyclerView(rvQuality);
//        mAdapter.setOnItemChildClickListener((adapter, view, position) -> {
//
//        });

    public ${name}Adapter(List<BookVpQualityItemBean> data) {
        super(R.layout.item_$layoutName, data);
    }


    @Override
    protected void convert(BaseViewHolder helper, BookVpQualityItemBean item) {
        TextView tv_name = helper.getView(R.id.tv_name);
        helper.addOnClickListener(R.id.tv_name);
    }
}
 
"""