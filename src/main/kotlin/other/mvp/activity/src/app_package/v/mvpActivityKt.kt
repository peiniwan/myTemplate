package other.mvp.activity.src.app_package.v


fun mvpActivityKt (
    applicationPackage: String?,
    activityClass: String,
    layoutName: String,
    packageName: String
)="""
package ${packageName}.mvp;
import com.tal.publish.business.main.R;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.tal.publish.common.base.BaseActivity;
import com.tal.publish.common.config.RouterConfig;
import com.tal.publish.common.utils.data.listener.OnViewClickListener;
import com.tal.publish.framework.logger.BookLogger;
import com.tal.publish.framework.utils.ToastUtils;
import $packageName.mvp.${activityClass}Presenter;
import $packageName.mvp.${activityClass}Contract;
import android.view.View;
import android.content.Intent;
import com.tal.publish.common.utils.statusbar.StatusBarCompat;
import com.tal.publish.common.network.rxjava.BookException;

@Route(path = RouterConfig.${activityClass})
public class ${activityClass}Activity extends BaseActivity<${activityClass}Presenter> implements View.OnClickListener,${activityClass}Contract.View {
    private final String TAG = this.getClass().getSimpleName();

    @Override
    protected void onViewCreate() {
        super.onViewCreate();
        StatusBarCompat.setLightStatusBar(this, false);
    }
    
    
    @Override
    protected int getLayout() {
        return R.layout.main_${layoutName};
    }

    @Override
    protected ${activityClass}Presenter getPresenter() {
        return new ${activityClass}Presenter(this);
    }
    
    @Override
    protected void onPrepareIntent(Intent intent) {
        super.onPrepareIntent(intent);
       
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.tv_name) {
        }
    }

    @Override
    public void serverOnSuccess() {
     
    }

    @Override
    public void serverOnFailure(BookException exception) {
//        BookLogger.e(TAG, exception.toString());

    }

    @Override
    public void showLoadingView() {
  
    }

    @Override
    public void showErrorView()  {
     
    }

    @Override
    public void showContentView() {
    
    }
    
    @Override
    protected void onDestroy() {
        super.onDestroy();
    }

}
"""