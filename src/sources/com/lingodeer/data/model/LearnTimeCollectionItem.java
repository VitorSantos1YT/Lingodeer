package com.lingodeer.data.model;

import com.tbruyelle.rxpermissions3.BuildConfig;
import defpackage.e;
import hh.p0;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class LearnTimeCollectionItem {
    private final int baseTime;
    private final String date;
    private final int seconds;

    public LearnTimeCollectionItem(String date, int i11, int i12) {
        m.f(date, "date");
        this.date = date;
        this.seconds = i11;
        this.baseTime = i12;
    }

    public static /* synthetic */ LearnTimeCollectionItem copy$default(LearnTimeCollectionItem learnTimeCollectionItem, String str, int i11, int i12, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = learnTimeCollectionItem.date;
        }
        if ((i13 & 2) != 0) {
            i11 = learnTimeCollectionItem.seconds;
        }
        if ((i13 & 4) != 0) {
            i12 = learnTimeCollectionItem.baseTime;
        }
        return learnTimeCollectionItem.copy(str, i11, i12);
    }

    public final String component1() {
        return this.date;
    }

    public final int component2() {
        return this.seconds;
    }

    public final int component3() {
        return this.baseTime;
    }

    public final LearnTimeCollectionItem copy(String date, int i11, int i12) {
        m.f(date, "date");
        return new LearnTimeCollectionItem(date, i11, i12);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LearnTimeCollectionItem)) {
            return false;
        }
        LearnTimeCollectionItem learnTimeCollectionItem = (LearnTimeCollectionItem) obj;
        return m.a(this.date, learnTimeCollectionItem.date) && this.seconds == learnTimeCollectionItem.seconds && this.baseTime == learnTimeCollectionItem.baseTime;
    }

    public final int getBaseTime() {
        return this.baseTime;
    }

    public final String getDate() {
        return this.date;
    }

    public final int getSeconds() {
        return this.seconds;
    }

    public int hashCode() {
        return Integer.hashCode(this.baseTime) + e.b(this.seconds, this.date.hashCode() * 31, 31);
    }

    public String toString() {
        String str = this.date;
        return p0.i(this.baseTime, ")", e.q(this.seconds, "LearnTimeCollectionItem(date=", str, ", seconds=", ", baseTime="));
    }

    public /* synthetic */ LearnTimeCollectionItem(String str, int i11, int i12, int i13, f fVar) {
        this((i13 & 1) != 0 ? BuildConfig.VERSION_NAME : str, i11, i12);
    }
}
