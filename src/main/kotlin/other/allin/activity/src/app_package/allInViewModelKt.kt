package other.allin.activity


fun allInViewModelKt(
    packageName:String,
    activityClass:String
)="""
package ${packageName}
import androidx.lifecycle.MutableLiveData
import com.allin.basicres.comm.entity.AsyncData
import com.allin.componentservice.lifecycles.CancelableViewModel

class ${activityClass}ViewModel : CancelableViewModel() {
    private val ${activityClass}LiveData: MutableLiveData<AsyncData> by lazy { MutableLiveData<AsyncData>() }

}    

interface ${activityClass}ApiService {
    
}

"""