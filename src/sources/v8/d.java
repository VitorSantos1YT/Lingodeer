package v8;

import android.text.Layout;
import android.text.SpannableStringBuilder;
import com.yalantis.ucrop.view.CropImageView;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final bq.h f53761c = new bq.h(27);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a7.b f53762a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f53763b;

    public d(SpannableStringBuilder spannableStringBuilder, Layout.Alignment alignment, float f5, int i11, float f11, int i12, boolean z11, int i13, int i14) {
        this.f53762a = new a7.b(spannableStringBuilder, alignment, null, null, f5, 0, i11, f11, i12, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, -3.4028235E38f, z11, z11 ? i13 : -16777216, Integer.MIN_VALUE, CropImageView.DEFAULT_ASPECT_RATIO, 0);
        this.f53763b = i14;
    }
}
