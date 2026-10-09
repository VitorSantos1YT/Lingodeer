package com.lingo.fluent.widget;

import android.content.Context;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.c2;
import androidx.recyclerview.widget.u1;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class WrapContentLinearLayoutManager extends LinearLayoutManager {
    public static final int $stable = 8;

    public WrapContentLinearLayoutManager(Context context) {
        super(1);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.m1
    public void onLayoutChildren(u1 u1Var, c2 state) {
        m.f(state, "state");
        try {
            super.onLayoutChildren(u1Var, state);
        } catch (IndexOutOfBoundsException unused) {
        }
    }
}
