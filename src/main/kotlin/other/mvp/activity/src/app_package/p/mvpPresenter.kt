package other.mvp.activity.src.app_package.p



fun mvpPresenter (
    applicationPackage: String?,
    packageName:String,
    activityClass: String
)="""
package $packageName.mvp;

import com.tal.publish.common.network.rxjava.BaseChTranformer;
import com.tal.publish.common.network.rxjava.BookCallback;
import com.tal.publish.common.network.rxjava.BookException;
import androidx.lifecycle.LifecycleOwner;
import com.rxjava.rxlife.RxLife;
import com.tal.publish.common.base.BasePresenter;
import com.tal.publish.framework.logger.BookLogger;
import com.tal.publish.framework.network.Api;
import com.tal.publish.business.main.api.MainAPI;
import $packageName.mvp.${activityClass}Contract;


public class ${activityClass}Presenter extends BasePresenter<${activityClass}Contract.View> implements ${activityClass}Contract.Presenter {
    private final String TAG = this.getClass().getSimpleName();
    public  ${activityClass}Presenter(LifecycleOwner owner) {
        super(owner);
    }

    @Override
    public void getData() {
        Api.service(MainAPI.class)
                .getLogoutInfo()
                .compose(new BaseChTranformer<Object>())
                .as(RxLife.as(this)).subscribe(new BookCallback() {
            @Override
            public void onSuccess(Object o) {
             
                mView.serverOnSuccess();
            }
            @Override
            public void onBookFailure(BookException bookException) {
                BookLogger.e(TAG, "onBookFailure--bookException== " + bookException.toString());
                if (mView != null) {
                    mView.serverOnFailure(bookException);
                }
            }
        });
    }

}
"""