package com.lingo.lingoskill.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.view.View;
import com.bumptech.glide.d;
import com.lingo.lingoskill.widget.LessonIndexTopOverlay;
import com.lingodeer.R;
import com.yalantis.ucrop.view.CropImageView;
import fr.j3;
import fz.a;
import kotlin.jvm.internal.m;
import qy.q;
import uu.f;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class LessonIndexTopOverlay extends View {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f22107e = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q f22108a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q f22109b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final q f22110c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final q f22111d;

    public LessonIndexTopOverlay(Context context) {
        super(context);
        this.f22108a = d.v(new f(4));
        new Path();
        final int i11 = 0;
        this.f22109b = d.v(new a(this) { // from class: vq.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ LessonIndexTopOverlay f54099b;

            {
                this.f54099b = this;
            }

            @Override // fz.a
            public final Object invoke() {
                switch (i11) {
                    case 0:
                        return LessonIndexTopOverlay.c(this.f54099b);
                    case 1:
                        return LessonIndexTopOverlay.b(this.f54099b);
                    default:
                        return LessonIndexTopOverlay.a(this.f54099b);
                }
            }
        });
        final int i12 = 1;
        this.f22110c = d.v(new a(this) { // from class: vq.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ LessonIndexTopOverlay f54099b;

            {
                this.f54099b = this;
            }

            @Override // fz.a
            public final Object invoke() {
                switch (i12) {
                    case 0:
                        return LessonIndexTopOverlay.c(this.f54099b);
                    case 1:
                        return LessonIndexTopOverlay.b(this.f54099b);
                    default:
                        return LessonIndexTopOverlay.a(this.f54099b);
                }
            }
        });
        final int i13 = 2;
        this.f22111d = d.v(new a(this) { // from class: vq.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ LessonIndexTopOverlay f54099b;

            {
                this.f54099b = this;
            }

            @Override // fz.a
            public final Object invoke() {
                switch (i13) {
                    case 0:
                        return LessonIndexTopOverlay.c(this.f54099b);
                    case 1:
                        return LessonIndexTopOverlay.b(this.f54099b);
                    default:
                        return LessonIndexTopOverlay.a(this.f54099b);
                }
            }
        });
    }

    public static RectF a(LessonIndexTopOverlay lessonIndexTopOverlay) {
        Context context = lessonIndexTopOverlay.getContext();
        m.e(context, "getContext(...)");
        return new RectF(CropImageView.DEFAULT_ASPECT_RATIO, j3.Z(56, context), lessonIndexTopOverlay.getWidth(), lessonIndexTopOverlay.getHeight());
    }

    public static RectF b(LessonIndexTopOverlay lessonIndexTopOverlay) {
        float width = lessonIndexTopOverlay.getWidth();
        Context context = lessonIndexTopOverlay.getContext();
        m.e(context, "getContext(...)");
        return new RectF(CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, width, j3.Z(56, context));
    }

    public static LinearGradient c(LessonIndexTopOverlay lessonIndexTopOverlay) {
        float measuredHeight = lessonIndexTopOverlay.getMeasuredHeight();
        Context context = lessonIndexTopOverlay.getContext();
        m.e(context, "getContext(...)");
        float fZ = measuredHeight - j3.Z(56, context);
        float measuredHeight2 = lessonIndexTopOverlay.getMeasuredHeight();
        int color = Color.parseColor("#FFDE2E");
        Context context2 = lessonIndexTopOverlay.getContext();
        m.e(context2, "getContext(...)");
        return new LinearGradient(CropImageView.DEFAULT_ASPECT_RATIO, fZ, CropImageView.DEFAULT_ASPECT_RATIO, measuredHeight2, new int[]{color, context2.getColor(R.color.transparent)}, (float[]) null, Shader.TileMode.CLAMP);
    }

    private final Paint getPaint() {
        return (Paint) this.f22108a.getValue();
    }

    private final RectF getRectF() {
        return (RectF) this.f22110c.getValue();
    }

    private final RectF getRectF2() {
        return (RectF) this.f22111d.getValue();
    }

    private final LinearGradient getShader() {
        return (LinearGradient) this.f22109b.getValue();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        m.f(canvas, "canvas");
        super.onDraw(canvas);
        canvas.drawRect(getRectF(), getPaint());
        getPaint().reset();
        getPaint().setShader(getShader());
        canvas.drawRect(getRectF2(), getPaint());
    }

    public LessonIndexTopOverlay(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f22108a = d.v(new f(4));
        new Path();
        final int i11 = 0;
        this.f22109b = d.v(new a(this) { // from class: vq.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ LessonIndexTopOverlay f54099b;

            {
                this.f54099b = this;
            }

            @Override // fz.a
            public final Object invoke() {
                switch (i11) {
                    case 0:
                        return LessonIndexTopOverlay.c(this.f54099b);
                    case 1:
                        return LessonIndexTopOverlay.b(this.f54099b);
                    default:
                        return LessonIndexTopOverlay.a(this.f54099b);
                }
            }
        });
        final int i12 = 1;
        this.f22110c = d.v(new a(this) { // from class: vq.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ LessonIndexTopOverlay f54099b;

            {
                this.f54099b = this;
            }

            @Override // fz.a
            public final Object invoke() {
                switch (i12) {
                    case 0:
                        return LessonIndexTopOverlay.c(this.f54099b);
                    case 1:
                        return LessonIndexTopOverlay.b(this.f54099b);
                    default:
                        return LessonIndexTopOverlay.a(this.f54099b);
                }
            }
        });
        final int i13 = 2;
        this.f22111d = d.v(new a(this) { // from class: vq.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ LessonIndexTopOverlay f54099b;

            {
                this.f54099b = this;
            }

            @Override // fz.a
            public final Object invoke() {
                switch (i13) {
                    case 0:
                        return LessonIndexTopOverlay.c(this.f54099b);
                    case 1:
                        return LessonIndexTopOverlay.b(this.f54099b);
                    default:
                        return LessonIndexTopOverlay.a(this.f54099b);
                }
            }
        });
    }

    public LessonIndexTopOverlay(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        this.f22108a = d.v(new f(4));
        new Path();
        final int i12 = 0;
        this.f22109b = d.v(new a(this) { // from class: vq.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ LessonIndexTopOverlay f54099b;

            {
                this.f54099b = this;
            }

            @Override // fz.a
            public final Object invoke() {
                switch (i12) {
                    case 0:
                        return LessonIndexTopOverlay.c(this.f54099b);
                    case 1:
                        return LessonIndexTopOverlay.b(this.f54099b);
                    default:
                        return LessonIndexTopOverlay.a(this.f54099b);
                }
            }
        });
        final int i13 = 1;
        this.f22110c = d.v(new a(this) { // from class: vq.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ LessonIndexTopOverlay f54099b;

            {
                this.f54099b = this;
            }

            @Override // fz.a
            public final Object invoke() {
                switch (i13) {
                    case 0:
                        return LessonIndexTopOverlay.c(this.f54099b);
                    case 1:
                        return LessonIndexTopOverlay.b(this.f54099b);
                    default:
                        return LessonIndexTopOverlay.a(this.f54099b);
                }
            }
        });
        final int i14 = 2;
        this.f22111d = d.v(new a(this) { // from class: vq.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ LessonIndexTopOverlay f54099b;

            {
                this.f54099b = this;
            }

            @Override // fz.a
            public final Object invoke() {
                switch (i14) {
                    case 0:
                        return LessonIndexTopOverlay.c(this.f54099b);
                    case 1:
                        return LessonIndexTopOverlay.b(this.f54099b);
                    default:
                        return LessonIndexTopOverlay.a(this.f54099b);
                }
            }
        });
    }
}
