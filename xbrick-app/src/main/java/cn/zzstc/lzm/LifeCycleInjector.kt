package cn.zzstc.lzm

import android.app.Application
import androidx.fragment.app.FragmentManager
import cn.zzstc.lzm.common.app.IAppLifeCycle
import cn.zzstc.lzm.common.app.ILifecycleInjector
import com.orhanobut.logger.Logger

class LifeCycleInjector :ILifecycleInjector{
    override fun injectAppLifeCycle(
        application: Application?,
        appLifeCycles: List<IAppLifeCycle?>?
    ) {
        Logger.d("application onCreate")
    }

    override fun injectActivityLifeCycle(
        application: Application?,
        activityLifecycleCallbacks: List<Application.ActivityLifecycleCallbacks?>?
    ) {

    }

    override fun injectFragmentLifeCycle(
        application: Application?,
        fragmentLifecycleCallbacks: List<FragmentManager.FragmentLifecycleCallbacks?>?
    ) {
    }

    override fun priority()=1

}