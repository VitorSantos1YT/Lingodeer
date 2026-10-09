package com.chad.library.adapter.base.entity;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class SectionMultiEntity<T> implements Serializable, MultiItemEntity {
    public String header;
    public boolean isHeader;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public T f7702t;

    public SectionMultiEntity(boolean z11, String str) {
        this.isHeader = z11;
        this.header = str;
        this.f7702t = null;
    }

    public SectionMultiEntity(T t6) {
        this.isHeader = false;
        this.header = null;
        this.f7702t = t6;
    }
}
