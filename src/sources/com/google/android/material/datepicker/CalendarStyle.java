package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Paint;
import com.google.android.material.resources.MaterialAttributes;
import com.google.android.material.resources.MaterialResources;
import com.lingodeer.R;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
final class CalendarStyle {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CalendarItemStyle f14316a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CalendarItemStyle f14317b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CalendarItemStyle f14318c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final CalendarItemStyle f14319d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final CalendarItemStyle f14320e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final CalendarItemStyle f14321f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final CalendarItemStyle f14322g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Paint f14323h;

    public CalendarStyle(Context context) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(MaterialAttributes.d(R.attr.materialCalendarStyle, context, MaterialCalendar.class.getCanonicalName()).data, com.google.android.material.R.styleable.E);
        this.f14316a = CalendarItemStyle.a(context, typedArrayObtainStyledAttributes.getResourceId(4, 0));
        this.f14322g = CalendarItemStyle.a(context, typedArrayObtainStyledAttributes.getResourceId(2, 0));
        this.f14317b = CalendarItemStyle.a(context, typedArrayObtainStyledAttributes.getResourceId(3, 0));
        this.f14318c = CalendarItemStyle.a(context, typedArrayObtainStyledAttributes.getResourceId(5, 0));
        ColorStateList colorStateListA = MaterialResources.a(context, typedArrayObtainStyledAttributes, 7);
        this.f14319d = CalendarItemStyle.a(context, typedArrayObtainStyledAttributes.getResourceId(9, 0));
        this.f14320e = CalendarItemStyle.a(context, typedArrayObtainStyledAttributes.getResourceId(8, 0));
        this.f14321f = CalendarItemStyle.a(context, typedArrayObtainStyledAttributes.getResourceId(10, 0));
        Paint paint = new Paint();
        this.f14323h = paint;
        paint.setColor(colorStateListA.getDefaultColor());
        typedArrayObtainStyledAttributes.recycle();
    }
}
