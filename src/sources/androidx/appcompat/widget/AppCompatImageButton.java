package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.ImageButton;
import android.widget.ImageView;
import com.lingodeer.R;
import r.i2;
import r.j2;
import r.k2;
import r.q;
import r.v;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public class AppCompatImageButton extends ImageButton {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q f913a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final v f914b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f915c;

    public AppCompatImageButton(Context context) {
        this(context, null);
    }

    @Override // android.widget.ImageView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        q qVar = this.f913a;
        if (qVar != null) {
            qVar.a();
        }
        v vVar = this.f914b;
        if (vVar != null) {
            vVar.a();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        q qVar = this.f913a;
        if (qVar != null) {
            return qVar.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        q qVar = this.f913a;
        if (qVar != null) {
            return qVar.c();
        }
        return null;
    }

    public ColorStateList getSupportImageTintList() {
        k2 k2Var;
        v vVar = this.f914b;
        if (vVar == null || (k2Var = vVar.f48671b) == null) {
            return null;
        }
        return (ColorStateList) k2Var.f48597c;
    }

    public PorterDuff.Mode getSupportImageTintMode() {
        k2 k2Var;
        v vVar = this.f914b;
        if (vVar == null || (k2Var = vVar.f48671b) == null) {
            return null;
        }
        return (PorterDuff.Mode) k2Var.f48598d;
    }

    @Override // android.widget.ImageView, android.view.View
    public final boolean hasOverlappingRendering() {
        return !(this.f914b.f48670a.getBackground() instanceof RippleDrawable) && super.hasOverlappingRendering();
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        q qVar = this.f913a;
        if (qVar != null) {
            qVar.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i11) {
        super.setBackgroundResource(i11);
        q qVar = this.f913a;
        if (qVar != null) {
            qVar.f(i11);
        }
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        v vVar = this.f914b;
        if (vVar != null) {
            vVar.a();
        }
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        v vVar = this.f914b;
        if (vVar != null && drawable != null && !this.f915c) {
            vVar.f48672c = drawable.getLevel();
        }
        super.setImageDrawable(drawable);
        if (vVar != null) {
            vVar.a();
            if (this.f915c) {
                return;
            }
            ImageView imageView = vVar.f48670a;
            if (imageView.getDrawable() != null) {
                imageView.getDrawable().setLevel(vVar.f48672c);
            }
        }
    }

    @Override // android.widget.ImageView
    public void setImageLevel(int i11) {
        super.setImageLevel(i11);
        this.f915c = true;
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i11) {
        this.f914b.c(i11);
    }

    @Override // android.widget.ImageView
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        v vVar = this.f914b;
        if (vVar != null) {
            vVar.a();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        q qVar = this.f913a;
        if (qVar != null) {
            qVar.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        q qVar = this.f913a;
        if (qVar != null) {
            qVar.i(mode);
        }
    }

    public void setSupportImageTintList(ColorStateList colorStateList) {
        v vVar = this.f914b;
        if (vVar != null) {
            if (vVar.f48671b == null) {
                vVar.f48671b = new k2();
            }
            k2 k2Var = vVar.f48671b;
            k2Var.f48597c = colorStateList;
            k2Var.f48596b = true;
            vVar.a();
        }
    }

    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        v vVar = this.f914b;
        if (vVar != null) {
            if (vVar.f48671b == null) {
                vVar.f48671b = new k2();
            }
            k2 k2Var = vVar.f48671b;
            k2Var.f48598d = mode;
            k2Var.f48595a = true;
            vVar.a();
        }
    }

    public AppCompatImageButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.imageButtonStyle);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppCompatImageButton(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        j2.a(context);
        this.f915c = false;
        i2.a(this, getContext());
        q qVar = new q(this);
        this.f913a = qVar;
        qVar.d(attributeSet, i11);
        v vVar = new v(this);
        this.f914b = vVar;
        vVar.b(attributeSet, i11);
    }
}
