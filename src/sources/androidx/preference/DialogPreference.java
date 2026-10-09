package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import com.lingodeer.R;
import p9.h0;
import q4.a;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class DialogPreference extends Preference {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final CharSequence f2304p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final String f2305q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final Drawable f2306r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final String f2307s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final String f2308t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public final int f2309u0;

    public DialogPreference(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, h0.f46672c, i11, 0);
        String string = typedArrayObtainStyledAttributes.getString(9);
        string = string == null ? typedArrayObtainStyledAttributes.getString(0) : string;
        this.f2304p0 = string;
        if (string == null) {
            this.f2304p0 = this.H;
        }
        String string2 = typedArrayObtainStyledAttributes.getString(8);
        this.f2305q0 = string2 == null ? typedArrayObtainStyledAttributes.getString(1) : string2;
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(6);
        this.f2306r0 = drawable == null ? typedArrayObtainStyledAttributes.getDrawable(2) : drawable;
        String string3 = typedArrayObtainStyledAttributes.getString(11);
        this.f2307s0 = string3 == null ? typedArrayObtainStyledAttributes.getString(3) : string3;
        String string4 = typedArrayObtainStyledAttributes.getString(10);
        this.f2308t0 = string4 == null ? typedArrayObtainStyledAttributes.getString(4) : string4;
        this.f2309u0 = typedArrayObtainStyledAttributes.getResourceId(7, typedArrayObtainStyledAttributes.getResourceId(5, 0));
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, p9.a0] */
    @Override // androidx.preference.Preference
    public void o() {
        ?? r9 = this.f2321b.f46651i;
        if (r9 != 0) {
            r9.j(this);
        }
    }

    public DialogPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, a.b(context, R.attr.dialogPreferenceStyle, android.R.attr.dialogPreferenceStyle));
    }
}
