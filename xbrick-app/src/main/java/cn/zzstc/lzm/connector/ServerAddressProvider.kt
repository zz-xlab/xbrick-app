package cn.zzstc.lzm.connector

import android.content.Context
import cn.zzstc.lzm.BuildConfig
import cn.zzstc.lzm.common.connector.IServerAddressProvider
import cn.zzstc.lzm.common.data.entity.AddressType
import cn.zzstc.lzm.common.data.entity.ServerAddress
import cn.zzstc.lzm.common.route.ConnectorPath
import com.alibaba.android.arouter.facade.annotation.Route

@Route(path = ConnectorPath.ADDRESS_SERVER, name = "服务器地址提供者")
class ServerAddressProvider : IServerAddressProvider {

    override fun init(context: Context?) {

    }

    override fun addresses(): List<ServerAddress> {
        val serverList = ArrayList<ServerAddress>()
        if (BuildConfig.BUILD_TYPE.equals("debug")) {
            serverList.add(
                ServerAddress(
                    "http://debug.xxx",
                    AddressType.Debug,
                    true
                )
            )
            serverList.add(ServerAddress("https://xxx.xxx", AddressType.Production, false))

        } else {
            serverList.add(
                ServerAddress(
                    "http://test.xxxx",
                    AddressType.Debug,
                    false
                )
            )
            serverList.add(ServerAddress("https://xxx.xxx", AddressType.Production, true))
        }
        serverList.add(ServerAddress("https://xxx.xxx", AddressType.Preview, false))
        return serverList
    }
}