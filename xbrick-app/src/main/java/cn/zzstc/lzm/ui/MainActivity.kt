package cn.zzstc.lzm.ui

import android.view.View
import androidx.databinding.DataBindingUtil
import cn.zzstc.lzm.R
import cn.zzstc.lzm.common.route.BasePath
import cn.zzstc.lzm.common.route.UserPath
import cn.zzstc.lzm.common.ui.BaseActivity
import cn.zzstc.lzm.databinding.ActivityMainBinding
import com.alibaba.android.arouter.launcher.ARouter

class MainActivity : BaseActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun setup() {
        binding= DataBindingUtil.setContentView(this, R.layout.activity_main)
        binding.activity=this
    }
    fun onClick(view:View){
        when(view.id){
            R.id.btnIndexOpenLogin->{
                ARouter.getInstance().build(UserPath.LOGIN).navigation()
            }
            R.id.btnIndexOpenLab->{
                ARouter.getInstance().build(BasePath.LAB_PAGE).navigation()
            }
        }
    }
}
