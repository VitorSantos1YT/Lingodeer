package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.lingodeer.R;
import fb.g0;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public class ActionMenuPresenter$OverflowMenuButton extends AppCompatImageView implements r.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ c f877a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ActionMenuPresenter$OverflowMenuButton(c cVar, Context context) {
        super(context, null, R.attr.actionOverflowButtonStyle);
        this.f877a = cVar;
        setClickable(true);
        setFocusable(true);
        setVisibility(0);
        setEnabled(true);
        g0.C(this, getContentDescription());
        setOnTouchListener(new b(this, this));
    }

    @Override // r.i
    public final boolean a() {
        return false;
    }

    @Override // r.i
    public final boolean b() {
        return false;
    }

    @Override // android.view.View
    public final boolean performClick() {
        if (super.performClick()) {
            return true;
        }
        playSoundEffect(0);
        this.f877a.n();
        return true;
    }

    @Override // android.widget.ImageView
    public final boolean setFrame(int i11, int i12, int i13, int i14) {
        boolean frame = super.setFrame(i11, i12, i13, i14);
        Drawable drawable = getDrawable();
        Drawable background = getBackground();
        if (drawable != null && background != null) {
            int width = getWidth();
            int height = getHeight();
            int iMax = Math.max(width, height) / 2;
            int paddingLeft = (width + (getPaddingLeft() - getPaddingRight())) / 2;
            int paddingTop = (height + (getPaddingTop() - getPaddingBottom())) / 2;
            background.setHotspotBounds(paddingLeft - iMax, paddingTop - iMax, paddingLeft + iMax, paddingTop + iMax);
        }
        return frame;
    }
}
