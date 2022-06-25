package other.mvp.activity.src.app_package.contract


fun mvpContract(
    packageName:String,
    activityName:String
)="""
package ${packageName}.mvp;

import com.tal.publish.common.base.IPresenter;
import com.tal.publish.common.base.IView;
import com.tal.publish.common.network.rxjava.BookException;


public interface ${activityName}Contract {
    interface Presenter extends IPresenter<View> {
        void getData();
    }

    interface View extends IView {

        //接口请求成功
        void serverOnSuccess();
        void serverOnFailure (BookException exception);
        void showErrorView();
        void showLoadingView();
        void showContentView();
    }
}
    
"""