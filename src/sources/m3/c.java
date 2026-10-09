package m3;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.Layout;
import android.text.style.LeadingMarginSpan;
import com.yalantis.ucrop.view.CropImageView;
import k3.s;
import kotlin.jvm.internal.m;
import se.p;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class c implements LeadingMarginSpan {
    @Override // android.text.style.LeadingMarginSpan
    public final void drawLeadingMargin(Canvas canvas, Paint paint, int i11, int i12, int i13, int i14, int i15, CharSequence charSequence, int i16, int i17, boolean z11, Layout layout) {
        int lineForOffset;
        if (layout == null || paint == null || (lineForOffset = layout.getLineForOffset(i16)) != layout.getLineCount() - 1) {
            return;
        }
        ThreadLocal threadLocal = s.f37905a;
        if (layout.getEllipsisCount(lineForOffset) > 0) {
            float fR = p.R(layout, lineForOffset, paint) + p.Q(layout, lineForOffset, paint);
            if (fR == CropImageView.DEFAULT_ASPECT_RATIO) {
                return;
            }
            m.c(canvas);
            canvas.translate(fR, CropImageView.DEFAULT_ASPECT_RATIO);
        }
    }

    @Override // android.text.style.LeadingMarginSpan
    public final int getLeadingMargin(boolean z11) {
        return 0;
    }
}
