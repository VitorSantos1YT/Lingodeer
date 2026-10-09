package androidx.media3.ui;

import a7.a;
import a7.b;
import a7.g;
import android.content.Context;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.CaptioningManager;
import android.widget.FrameLayout;
import gb.r;
import h9.c;
import h9.h0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class SubtitleView extends FrameLayout {
    public h0 H;
    public View K;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public List f2283a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public c f2284b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f2285c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f2286d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f2287e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f2288f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f2289t;

    public SubtitleView(Context context) {
        this(context, null);
    }

    private List<b> getCuesWithStylingPreferencesApplied() {
        if (this.f2287e && this.f2288f) {
            return this.f2283a;
        }
        ArrayList arrayList = new ArrayList(this.f2283a.size());
        for (int i11 = 0; i11 < this.f2283a.size(); i11++) {
            a aVarA = ((b) this.f2283a.get(i11)).a();
            if (!this.f2287e) {
                aVarA.f400n = false;
                CharSequence charSequence = aVarA.f388a;
                if (charSequence instanceof Spanned) {
                    if (!(charSequence instanceof Spannable)) {
                        aVarA.f388a = SpannableString.valueOf(charSequence);
                        aVarA.f389b = null;
                    }
                    CharSequence charSequence2 = aVarA.f388a;
                    charSequence2.getClass();
                    Spannable spannable = (Spannable) charSequence2;
                    for (Object obj : spannable.getSpans(0, spannable.length(), Object.class)) {
                        if (!(obj instanceof g)) {
                            spannable.removeSpan(obj);
                        }
                    }
                }
                r.M(aVarA);
            } else if (!this.f2288f) {
                r.M(aVarA);
            }
            arrayList.add(aVarA.a());
        }
        return arrayList;
    }

    private float getUserCaptionFontScale() {
        CaptioningManager captioningManager;
        if (isInEditMode() || (captioningManager = (CaptioningManager) getContext().getSystemService("captioning")) == null || !captioningManager.isEnabled()) {
            return 1.0f;
        }
        return captioningManager.getFontScale();
    }

    private c getUserCaptionStyle() {
        boolean zIsInEditMode = isInEditMode();
        c cVar = c.f32009g;
        if (zIsInEditMode) {
            return cVar;
        }
        CaptioningManager captioningManager = (CaptioningManager) getContext().getSystemService("captioning");
        if (captioningManager != null && captioningManager.isEnabled()) {
            CaptioningManager.CaptionStyle userStyle = captioningManager.getUserStyle();
            cVar = new c(userStyle.hasForegroundColor() ? userStyle.foregroundColor : -1, userStyle.hasBackgroundColor() ? userStyle.backgroundColor : -16777216, userStyle.hasWindowColor() ? userStyle.windowColor : 0, userStyle.hasEdgeType() ? userStyle.edgeType : 0, userStyle.hasEdgeColor() ? userStyle.edgeColor : -1, userStyle.getTypeface());
        }
        return cVar;
    }

    private <T extends View & h0> void setView(T t6) {
        removeView(this.K);
        View view = this.K;
        if (view instanceof WebViewSubtitleOutput) {
            ((WebViewSubtitleOutput) view).f2298b.destroy();
        }
        this.K = t6;
        this.H = t6;
        addView(t6);
    }

    public final void a() {
        setStyle(getUserCaptionStyle());
    }

    public final void b() {
        setFractionalTextSize(getUserCaptionFontScale() * 0.0533f);
    }

    public final void c() {
        this.H.a(getCuesWithStylingPreferencesApplied(), this.f2284b, this.f2285c, this.f2286d);
    }

    public void setApplyEmbeddedFontSizes(boolean z11) {
        this.f2288f = z11;
        c();
    }

    public void setApplyEmbeddedStyles(boolean z11) {
        this.f2287e = z11;
        c();
    }

    public void setBottomPaddingFraction(float f5) {
        this.f2286d = f5;
        c();
    }

    public void setCues(List<b> list) {
        if (list == null) {
            list = Collections.EMPTY_LIST;
        }
        this.f2283a = list;
        c();
    }

    public void setFractionalTextSize(float f5) {
        this.f2285c = f5;
        c();
    }

    public void setStyle(c cVar) {
        this.f2284b = cVar;
        c();
    }

    public void setViewType(int i11) {
        if (this.f2289t == i11) {
            return;
        }
        if (i11 == 1) {
            setView(new CanvasSubtitleOutput(getContext(), 0));
        } else {
            if (i11 != 2) {
                throw new IllegalArgumentException();
            }
            setView(new WebViewSubtitleOutput(getContext()));
        }
        this.f2289t = i11;
    }

    public SubtitleView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f2283a = Collections.EMPTY_LIST;
        this.f2284b = c.f32009g;
        this.f2285c = 0.0533f;
        this.f2286d = 0.08f;
        this.f2287e = true;
        this.f2288f = true;
        CanvasSubtitleOutput canvasSubtitleOutput = new CanvasSubtitleOutput(context, 0);
        this.H = canvasSubtitleOutput;
        this.K = canvasSubtitleOutput;
        addView(canvasSubtitleOutput);
        this.f2289t = 1;
    }
}
