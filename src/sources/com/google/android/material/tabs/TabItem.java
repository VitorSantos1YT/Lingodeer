package com.google.android.material.tabs;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import com.google.android.material.R;
import qp.m4;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class TabItem extends View {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CharSequence f15515a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Drawable f15516b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f15517c;

    public TabItem(Context context) {
        this(context, null);
    }

    public TabItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m4 m4VarJ = m4.j(context, attributeSet, R.styleable.f13746i0);
        TypedArray typedArray = (TypedArray) m4VarJ.f48061c;
        this.f15515a = typedArray.getText(2);
        this.f15516b = m4VarJ.g(0);
        this.f15517c = typedArray.getResourceId(1, 0);
        m4VarJ.l();
    }
}
