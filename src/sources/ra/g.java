package ra;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import java.io.IOException;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class g extends h implements Animatable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Context f48996c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public gi.g f48997d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ArrayList f48998e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final d f48999f = new d(this);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f48995b = new e();

    public g(Context context, int i11) {
        this.f48996c = context;
    }

    @Override // ra.h, android.graphics.drawable.Drawable
    public final void applyTheme(Resources.Theme theme) {
        Drawable drawable = this.f49000a;
        if (drawable != null) {
            drawable.applyTheme(theme);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean canApplyTheme() {
        Drawable drawable = this.f49000a;
        if (drawable != null) {
            return drawable.canApplyTheme();
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Drawable drawable = this.f49000a;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        e eVar = this.f48995b;
        eVar.f48991a.draw(canvas);
        if (eVar.f48992b.isStarted()) {
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        Drawable drawable = this.f49000a;
        return drawable != null ? drawable.getAlpha() : this.f48995b.f48991a.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        Drawable drawable = this.f49000a;
        if (drawable != null) {
            return drawable.getChangingConfigurations();
        }
        int changingConfigurations = super.getChangingConfigurations();
        this.f48995b.getClass();
        return changingConfigurations;
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        Drawable drawable = this.f49000a;
        return drawable != null ? drawable.getColorFilter() : this.f48995b.f48991a.getColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        if (this.f49000a != null) {
            return new ge.c(this.f49000a.getConstantState(), 1);
        }
        return null;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        Drawable drawable = this.f49000a;
        return drawable != null ? drawable.getIntrinsicHeight() : this.f48995b.f48991a.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        Drawable drawable = this.f49000a;
        return drawable != null ? drawable.getIntrinsicWidth() : this.f48995b.f48991a.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        Drawable drawable = this.f49000a;
        return drawable != null ? drawable.getOpacity() : this.f48995b.f48991a.getOpacity();
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        e eVar;
        Drawable drawable = this.f49000a;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet, theme);
            return;
        }
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth() + 1;
        while (true) {
            eVar = this.f48995b;
            if (eventType == 1 || (xmlPullParser.getDepth() < depth && eventType == 3)) {
                break;
            }
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                if ("animated-vector".equals(name)) {
                    TypedArray typedArrayH = q4.a.h(resources, theme, attributeSet, a.f48986e);
                    int resourceId = typedArrayH.getResourceId(0, 0);
                    if (resourceId != 0) {
                        q qVar = new q();
                        ThreadLocal threadLocal = q4.j.f47447a;
                        qVar.f49000a = resources.getDrawable(resourceId, theme);
                        qVar.f49057f = false;
                        qVar.setCallback(this.f48999f);
                        q qVar2 = eVar.f48991a;
                        if (qVar2 != null) {
                            qVar2.setCallback(null);
                        }
                        eVar.f48991a = qVar;
                    }
                    typedArrayH.recycle();
                } else if ("target".equals(name)) {
                    TypedArray typedArrayObtainAttributes = resources.obtainAttributes(attributeSet, a.f48987f);
                    String string = typedArrayObtainAttributes.getString(0);
                    int resourceId2 = typedArrayObtainAttributes.getResourceId(1, 0);
                    if (resourceId2 != 0) {
                        Context context = this.f48996c;
                        if (context == null) {
                            typedArrayObtainAttributes.recycle();
                            throw new IllegalStateException("Context can't be null when inflating animators");
                        }
                        Animator animatorLoadAnimator = AnimatorInflater.loadAnimator(context, resourceId2);
                        animatorLoadAnimator.setTarget(eVar.f48991a.f49053b.f49041b.f49039o.get(string));
                        if (eVar.f48993c == null) {
                            eVar.f48993c = new ArrayList();
                            eVar.f48994d = new y.e(0);
                        }
                        eVar.f48993c.add(animatorLoadAnimator);
                        eVar.f48994d.put(animatorLoadAnimator, string);
                    }
                    typedArrayObtainAttributes.recycle();
                } else {
                    continue;
                }
            }
            eventType = xmlPullParser.next();
        }
        if (eVar.f48992b == null) {
            eVar.f48992b = new AnimatorSet();
        }
        eVar.f48992b.playTogether(eVar.f48993c);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
        Drawable drawable = this.f49000a;
        return drawable != null ? drawable.isAutoMirrored() : this.f48995b.f48991a.isAutoMirrored();
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        Drawable drawable = this.f49000a;
        return drawable != null ? ((AnimatedVectorDrawable) drawable).isRunning() : this.f48995b.f48992b.isRunning();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        Drawable drawable = this.f49000a;
        return drawable != null ? drawable.isStateful() : this.f48995b.f48991a.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        Drawable drawable = this.f49000a;
        if (drawable != null) {
            drawable.mutate();
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.f49000a;
        if (drawable != null) {
            drawable.setBounds(rect);
        } else {
            this.f48995b.f48991a.setBounds(rect);
        }
    }

    @Override // ra.h, android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i11) {
        Drawable drawable = this.f49000a;
        return drawable != null ? drawable.setLevel(i11) : this.f48995b.f48991a.setLevel(i11);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        Drawable drawable = this.f49000a;
        return drawable != null ? drawable.setState(iArr) : this.f48995b.f48991a.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i11) {
        Drawable drawable = this.f49000a;
        if (drawable != null) {
            drawable.setAlpha(i11);
        } else {
            this.f48995b.f48991a.setAlpha(i11);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean z11) {
        Drawable drawable = this.f49000a;
        if (drawable != null) {
            drawable.setAutoMirrored(z11);
        } else {
            this.f48995b.f48991a.setAutoMirrored(z11);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f49000a;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.f48995b.f48991a.setColorFilter(colorFilter);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i11) {
        Drawable drawable = this.f49000a;
        if (drawable != null) {
            ub.a.b0(drawable, i11);
        } else {
            this.f48995b.f48991a.setTint(i11);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f49000a;
        if (drawable != null) {
            drawable.setTintList(colorStateList);
        } else {
            this.f48995b.f48991a.setTintList(colorStateList);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f49000a;
        if (drawable != null) {
            drawable.setTintMode(mode);
        } else {
            this.f48995b.f48991a.setTintMode(mode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z11, boolean z12) {
        Drawable drawable = this.f49000a;
        if (drawable != null) {
            return drawable.setVisible(z11, z12);
        }
        this.f48995b.f48991a.setVisible(z11, z12);
        return super.setVisible(z11, z12);
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        Drawable drawable = this.f49000a;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).start();
            return;
        }
        e eVar = this.f48995b;
        if (eVar.f48992b.isStarted()) {
            return;
        }
        eVar.f48992b.start();
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        Drawable drawable = this.f49000a;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).stop();
        } else {
            this.f48995b.f48992b.end();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) throws XmlPullParserException, IOException {
        inflate(resources, xmlPullParser, attributeSet, null);
    }
}
