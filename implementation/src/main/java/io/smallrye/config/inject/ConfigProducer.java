/*
 * Copyright 2017 Red Hat, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.smallrye.config.inject;

import static io.smallrye.config.inject.SecuritySupport.getContextClassLoader;

import java.util.*;
import java.util.function.Supplier;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.context.Dependent;
import javax.enterprise.inject.Produces;
import javax.enterprise.inject.spi.InjectionPoint;

import org.eclipse.microprofile.config.Config;
import org.eclipse.microprofile.config.ConfigProvider;
import org.eclipse.microprofile.config.inject.ConfigProperty;

import io.smallrye.config.ConfigValue;

/**
 * CDI producer for {@link Config} bean.
 *
 * @author <a href="http://jmesnil.net/">Jeff Mesnil</a> (c) 2017 Red Hat inc.
 */
@ApplicationScoped
public class ConfigProducer {
    @Produces
    protected Config getConfig(InjectionPoint injectionPoint) {
        return ConfigProvider.getConfig(getContextClassLoader());
    }

    @Dependent
    @Produces
    @ConfigProperty
    protected String produceStringConfigProperty(InjectionPoint ip) {
        return ConfigProducerUtil.getValue(ip, getConfig(ip));
    }

    @Dependent
    @Produces
    @ConfigProperty
    protected Long getLongValue(InjectionPoint ip) {
        return ConfigProducerUtil.getValue(ip, getConfig(ip));
    }

    @Dependent
    @Produces
    @ConfigProperty
    protected Integer getIntegerValue(InjectionPoint ip) {
        return ConfigProducerUtil.getValue(ip, getConfig(ip));
    }

    @Dependent
    @Produces
    @ConfigProperty
    protected Float produceFloatConfigProperty(InjectionPoint ip) {
        return ConfigProducerUtil.getValue(ip, getConfig(ip));
    }

    @Dependent
    @Produces
    @ConfigProperty
    protected Double produceDoubleConfigProperty(InjectionPoint ip) {
        return ConfigProducerUtil.getValue(ip, getConfig(ip));
    }

    @Dependent
    @Produces
    @ConfigProperty
    protected Boolean produceBooleanConfigProperty(InjectionPoint ip) {
        return ConfigProducerUtil.getValue(ip, getConfig(ip));
    }

    @Dependent
    @Produces
    @ConfigProperty
    protected Short produceShortConfigProperty(InjectionPoint ip) {
        return ConfigProducerUtil.getValue(ip, getConfig(ip));
    }

    @Dependent
    @Produces
    @ConfigProperty
    protected Byte produceByteConfigProperty(InjectionPoint ip) {
        return ConfigProducerUtil.getValue(ip, getConfig(ip));
    }

    @Dependent
    @Produces
    @ConfigProperty
    protected Character produceCharacterConfigProperty(InjectionPoint ip) {
        return ConfigProducerUtil.getValue(ip, getConfig(ip));
    }

    @Dependent
    @Produces
    @ConfigProperty
    protected <T> Optional<T> produceOptionalConfigValue(InjectionPoint ip) {
        return ConfigProducerUtil.getValue(ip, getConfig(ip));
    }

    @Dependent
    @Produces
    @ConfigProperty
    protected <T> Supplier<T> produceSupplierConfigValue(InjectionPoint ip) {
        return () -> ConfigProducerUtil.getValue(ip, getConfig(ip));
    }

    @Dependent
    @Produces
    @ConfigProperty
    protected <T> Set<T> producesSetConfigProperty(InjectionPoint ip) {
        return ConfigProducerUtil.getValue(ip, getConfig(ip));
    }

    @Dependent
    @Produces
    @ConfigProperty
    protected <T> List<T> producesListConfigProperty(InjectionPoint ip) {
        return ConfigProducerUtil.getValue(ip, getConfig(ip));
    }

    @Dependent
    @Produces
    @ConfigProperty
    protected OptionalInt produceOptionalIntConfigProperty(InjectionPoint ip) {
        return ConfigProducerUtil.getValue(ip, getConfig(ip));
    }

    @Dependent
    @Produces
    @ConfigProperty
    protected OptionalLong produceOptionalLongConfigProperty(InjectionPoint ip) {
        return ConfigProducerUtil.getValue(ip, getConfig(ip));
    }

    @Dependent
    @Produces
    @ConfigProperty
    protected OptionalDouble produceOptionalDoubleConfigProperty(InjectionPoint ip) {
        return ConfigProducerUtil.getValue(ip, getConfig(ip));
    }

    @Dependent
    @Produces
    @ConfigProperty
    protected ConfigValue produceConfigValue(InjectionPoint ip) {
        return ConfigProducerUtil.getConfigValue(ip, getConfig(ip));
    }
}
