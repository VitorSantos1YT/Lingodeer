package gd;

import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.os.Build;
import android.os.LocaleList;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class m extends Paint {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f29123a;

    @Override // android.graphics.Paint
    public void setAlpha(int i11) {
        switch (this.f29123a) {
            case 2:
                if (Build.VERSION.SDK_INT >= 30) {
                    super.setAlpha(kd.h.c(i11));
                } else {
                    setColor((kd.h.c(i11) << 24) | (getColor() & 16777215));
                }
                break;
            default:
                super.setAlpha(i11);
                break;
        }
    }

    @Override // android.graphics.Paint
    public void setTextLocales(LocaleList localeList) {
        switch (this.f29123a) {
            case 2:
                break;
            default:
                super.setTextLocales(localeList);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m(int i11, int i12) {
        super(i11);
        this.f29123a = i12;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(PorterDuff.Mode mode) {
        super(1);
        this.f29123a = 2;
        setXfermode(new PorterDuffXfermode(mode));
    }

    private final void a(LocaleList localeList) {
    }
}
