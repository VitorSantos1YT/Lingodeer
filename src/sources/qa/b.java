package qa;

import android.graphics.PointF;
import android.graphics.Rect;
import android.util.Property;
import android.view.View;
import androidx.appcompat.widget.SwitchCompat;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends Property {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f47594a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(int i11, Class cls, String str) {
        super(cls, str);
        this.f47594a = i11;
    }

    @Override // android.util.Property
    public final Object get(Object obj) {
        switch (this.f47594a) {
            case 0:
                return null;
            case 1:
                return null;
            case 2:
                return null;
            case 3:
                return null;
            case 4:
                return null;
            case 5:
                return Float.valueOf(e0.f47614a.u((View) obj));
            case 6:
                return ((View) obj).getClipBounds();
            default:
                return Float.valueOf(((SwitchCompat) obj).f1008e0);
        }
    }

    @Override // android.util.Property
    public final void set(Object obj, Object obj2) {
        switch (this.f47594a) {
            case 0:
                e eVar = (e) obj;
                PointF pointF = (PointF) obj2;
                eVar.getClass();
                eVar.f47607a = Math.round(pointF.x);
                int iRound = Math.round(pointF.y);
                eVar.f47608b = iRound;
                int i11 = eVar.f47612f + 1;
                eVar.f47612f = i11;
                if (i11 == eVar.f47613g) {
                    e0.a(eVar.f47611e, eVar.f47607a, iRound, eVar.f47609c, eVar.f47610d);
                    eVar.f47612f = 0;
                    eVar.f47613g = 0;
                }
                break;
            case 1:
                e eVar2 = (e) obj;
                PointF pointF2 = (PointF) obj2;
                eVar2.getClass();
                eVar2.f47609c = Math.round(pointF2.x);
                int iRound2 = Math.round(pointF2.y);
                eVar2.f47610d = iRound2;
                int i12 = eVar2.f47613g + 1;
                eVar2.f47613g = i12;
                if (eVar2.f47612f == i12) {
                    e0.a(eVar2.f47611e, eVar2.f47607a, eVar2.f47608b, eVar2.f47609c, iRound2);
                    eVar2.f47612f = 0;
                    eVar2.f47613g = 0;
                }
                break;
            case 2:
                View view = (View) obj;
                PointF pointF3 = (PointF) obj2;
                e0.a(view, view.getLeft(), view.getTop(), Math.round(pointF3.x), Math.round(pointF3.y));
                break;
            case 3:
                View view2 = (View) obj;
                PointF pointF4 = (PointF) obj2;
                e0.a(view2, Math.round(pointF4.x), Math.round(pointF4.y), view2.getRight(), view2.getBottom());
                break;
            case 4:
                View view3 = (View) obj;
                PointF pointF5 = (PointF) obj2;
                int iRound3 = Math.round(pointF5.x);
                int iRound4 = Math.round(pointF5.y);
                e0.a(view3, iRound3, iRound4, view3.getWidth() + iRound3, view3.getHeight() + iRound4);
                break;
            case 5:
                float fFloatValue = ((Float) obj2).floatValue();
                e0.f47614a.I((View) obj, fFloatValue);
                break;
            case 6:
                ((View) obj).setClipBounds((Rect) obj2);
                break;
            default:
                ((SwitchCompat) obj).setThumbPosition(((Float) obj2).floatValue());
                break;
        }
    }
}
