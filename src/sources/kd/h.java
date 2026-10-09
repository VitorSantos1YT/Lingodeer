package kd;

import android.graphics.Path;
import android.graphics.PointF;
import fd.p;
import hh.p0;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final PointF f38098a = new PointF();

    public static PointF a(PointF pointF, PointF pointF2) {
        return new PointF(pointF.x + pointF2.x, pointF.y + pointF2.y);
    }

    public static float b(float f5, float f11, float f12) {
        return Math.max(f11, Math.min(f12, f5));
    }

    public static int c(int i11) {
        return Math.max(0, Math.min(255, i11));
    }

    public static int d(float f5, float f11) {
        int i11 = (int) f5;
        int i12 = (int) f11;
        int i13 = i11 / i12;
        int i14 = i11 % i12;
        if (!((i11 ^ i12) >= 0) && i14 != 0) {
            i13--;
        }
        return i11 - (i12 * i13);
    }

    public static void e(p pVar, Path path) {
        Path path2;
        path.reset();
        PointF pointF = pVar.f27195b;
        ArrayList arrayList = pVar.f27194a;
        path.moveTo(pointF.x, pointF.y);
        float f5 = pointF.x;
        float f11 = pointF.y;
        PointF pointF2 = f38098a;
        pointF2.set(f5, f11);
        int i11 = 0;
        while (i11 < arrayList.size()) {
            dd.a aVar = (dd.a) arrayList.get(i11);
            PointF pointF3 = aVar.f23354a;
            PointF pointF4 = aVar.f23355b;
            PointF pointF5 = aVar.f23356c;
            if (pointF3.equals(pointF2) && pointF4.equals(pointF5)) {
                path.lineTo(pointF5.x, pointF5.y);
                path2 = path;
            } else {
                path2 = path;
                path2.cubicTo(pointF3.x, pointF3.y, pointF4.x, pointF4.y, pointF5.x, pointF5.y);
            }
            pointF2.set(pointF5.x, pointF5.y);
            i11++;
            path = path2;
        }
        Path path3 = path;
        if (pVar.f27196c) {
            path3.close();
        }
    }

    public static float f(float f5, float f11, float f12) {
        return p0.a(f11, f5, f12, f5);
    }

    public static void g(dd.f fVar, int i11, ArrayList arrayList, dd.f fVar2, yc.k kVar) {
        if (fVar.a(i11, kVar.getName())) {
            String name = kVar.getName();
            dd.f fVar3 = new dd.f(fVar2);
            fVar3.f23379a.add(name);
            dd.f fVar4 = new dd.f(fVar3);
            fVar4.f23380b = kVar;
            arrayList.add(fVar4);
        }
    }
}
