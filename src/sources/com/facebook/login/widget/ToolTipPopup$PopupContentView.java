package com.facebook.login.widget;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.lingodeer.R;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
final class ToolTipPopup$PopupContentView extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ImageView f7732a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ImageView f7733b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final View f7734c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ImageView f7735d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ToolTipPopup$PopupContentView(Context context) {
        super(context);
        m.f(context, "context");
        LayoutInflater.from(context).inflate(R.layout.com_facebook_tooltip_bubble, this);
        View viewFindViewById = findViewById(R.id.com_facebook_tooltip_bubble_view_top_pointer);
        m.d(viewFindViewById, "null cannot be cast to non-null type android.widget.ImageView");
        this.f7732a = (ImageView) viewFindViewById;
        View viewFindViewById2 = findViewById(R.id.com_facebook_tooltip_bubble_view_bottom_pointer);
        m.d(viewFindViewById2, "null cannot be cast to non-null type android.widget.ImageView");
        this.f7733b = (ImageView) viewFindViewById2;
        View viewFindViewById3 = findViewById(R.id.com_facebook_body_frame);
        m.e(viewFindViewById3, "findViewById(R.id.com_facebook_body_frame)");
        this.f7734c = viewFindViewById3;
        View viewFindViewById4 = findViewById(R.id.com_facebook_button_xout);
        m.d(viewFindViewById4, "null cannot be cast to non-null type android.widget.ImageView");
        this.f7735d = (ImageView) viewFindViewById4;
    }
}
