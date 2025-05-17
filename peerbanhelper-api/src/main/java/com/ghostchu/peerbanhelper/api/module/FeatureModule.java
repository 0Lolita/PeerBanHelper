package com.ghostchu.peerbanhelper.api.module;

import org.bspfsystems.yamlconfiguration.configuration.ConfigurationSection;
import org.jetbrains.annotations.NotNull;

import java.io.IOException;
import java.util.concurrent.locks.ReentrantLock;

public interface FeatureModule {
    /**
     * 获取功能模块的人类可读名称
     *
     * @return 模块可读名称
     */
    @NotNull
    String getName();

    /**
     * 获取功能模块的内部配置键名
     *
     * @return 配置键名
     */
    @NotNull
    String getConfigName();

    boolean isModuleEnabled();

    ConfigurationSection getConfig();

    ReentrantLock getThreadLock();

    /**
     * 功能模块启用回调
     */
    void onEnable();

    /**
     * 功能模块禁用回调
     */
    void onDisable();

    /**
     * 功能模块启用序列
     */
    void enable();

    /**
     * 功能模块禁用序列
     */
    void disable();

    /**
     * 保存配置
     */
    void saveConfig() throws IOException;

}
