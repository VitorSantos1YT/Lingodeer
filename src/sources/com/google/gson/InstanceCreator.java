package com.google.gson;

import java.lang.reflect.Type;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public interface InstanceCreator<T> {
    T createInstance(Type type);
}
