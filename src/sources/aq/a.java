package aq;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.lingodeer.data.model.Daily;
import ff.h;
import fz.e;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.m;
import oz.x;
import qy.q;
import rz.b0;
import vy.d;
import xy.i;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class a extends i implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2826a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f2827b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(String str, d dVar, int i11) {
        super(2, dVar);
        this.f2826a = i11;
        this.f2827b = str;
    }

    @Override // xy.a
    public final d create(Object obj, d dVar) {
        switch (this.f2826a) {
            case 0:
                return new a(this.f2827b, dVar, 0);
            case 1:
                return new a(this.f2827b, dVar, 1);
            case 2:
                return new a(this.f2827b, dVar, 2);
            case 3:
                return new a(this.f2827b, dVar, 3);
            case 4:
                return new a(this.f2827b, dVar, 4);
            case 5:
                return new a(this.f2827b, dVar, 5);
            case 6:
                return new a(this.f2827b, dVar, 6);
            case 7:
                return new a(this.f2827b, dVar, 7);
            case 8:
                return new a(this.f2827b, dVar, 8);
            case 9:
                return new a(this.f2827b, dVar, 9);
            case 10:
                return new a(this.f2827b, dVar, 10);
            case 11:
                return new a(this.f2827b, dVar, 11);
            case 12:
                return new a(this.f2827b, dVar, 12);
            case 13:
                return new a(this.f2827b, dVar, 13);
            case 14:
                return new a(this.f2827b, dVar, 14);
            case 15:
                return new a(this.f2827b, dVar, 15);
            default:
                return new a(this.f2827b, dVar, 16);
        }
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) throws IOException {
        b0 b0Var = (b0) obj;
        d dVar = (d) obj2;
        switch (this.f2826a) {
            case 0:
                return ((a) create(b0Var, dVar)).invokeSuspend(qy.b0.f48488a);
            case 1:
                return ((a) create(b0Var, dVar)).invokeSuspend(qy.b0.f48488a);
            case 2:
                a aVar = (a) create(b0Var, dVar);
                qy.b0 b0Var2 = qy.b0.f48488a;
                aVar.invokeSuspend(b0Var2);
                return b0Var2;
            case 3:
                return ((a) create(b0Var, dVar)).invokeSuspend(qy.b0.f48488a);
            case 4:
                return ((a) create(b0Var, dVar)).invokeSuspend(qy.b0.f48488a);
            case 5:
                return ((a) create(b0Var, dVar)).invokeSuspend(qy.b0.f48488a);
            case 6:
                return ((a) create(b0Var, dVar)).invokeSuspend(qy.b0.f48488a);
            case 7:
                return ((a) create(b0Var, dVar)).invokeSuspend(qy.b0.f48488a);
            case 8:
                return ((a) create(b0Var, dVar)).invokeSuspend(qy.b0.f48488a);
            case 9:
                return ((a) create(b0Var, dVar)).invokeSuspend(qy.b0.f48488a);
            case 10:
                return ((a) create(b0Var, dVar)).invokeSuspend(qy.b0.f48488a);
            case 11:
                return ((a) create(b0Var, dVar)).invokeSuspend(qy.b0.f48488a);
            case 12:
                return ((a) create(b0Var, dVar)).invokeSuspend(qy.b0.f48488a);
            case 13:
                a aVar2 = (a) create(b0Var, dVar);
                qy.b0 b0Var3 = qy.b0.f48488a;
                aVar2.invokeSuspend(b0Var3);
                return b0Var3;
            case 14:
                return ((a) create(b0Var, dVar)).invokeSuspend(qy.b0.f48488a);
            case 15:
                return ((a) create(b0Var, dVar)).invokeSuspend(qy.b0.f48488a);
            default:
                return ((a) create(b0Var, dVar)).invokeSuspend(qy.b0.f48488a);
        }
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) throws IOException {
        int i11 = this.f2826a;
        qy.b0 b0Var = qy.b0.f48488a;
        String filePath = this.f2827b;
        switch (i11) {
            case 0:
                wy.a aVar = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                q qVar = fv.b.f28186a;
                return Boolean.valueOf(new File(fv.b.c(filePath, null, null)).exists());
            case 1:
                wy.a aVar2 = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                m.f(filePath, "filePath");
                File file = new File(filePath);
                File parentFile = file.getParentFile();
                if (parentFile != null && !parentFile.exists() && !parentFile.mkdirs()) {
                    throw new IOException("无法创建录音目录");
                }
                if (file.exists() && file.isDirectory()) {
                    throw new IOException("录音路径被目录占用");
                }
                return file;
            case 2:
                wy.a aVar3 = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                h.C(filePath);
                return b0Var;
            case 3:
                wy.a aVar4 = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                q qVar2 = fv.b.f28186a;
                return Boolean.valueOf(new File(fv.b.b(filePath)).exists());
            case 4:
                wy.a aVar5 = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                return Boolean.valueOf(new File(xt.b.a().p(), filePath).exists());
            case 5:
                wy.a aVar6 = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                return Boolean.valueOf(new File(filePath).delete());
            case 6:
                wy.a aVar7 = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                return Boolean.valueOf(new File(filePath).delete());
            case 7:
                wy.a aVar8 = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                q qVar3 = fv.b.f28186a;
                String lowerCase = filePath.toLowerCase(Locale.ROOT);
                m.e(lowerCase, "toLowerCase(...)");
                return Boolean.valueOf(new File(fv.b.c(lowerCase, null, null)).exists());
            case 8:
                wy.a aVar9 = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                q qVar4 = fv.b.f28186a;
                return Boolean.valueOf(new File(fv.b.c(filePath, null, null)).exists());
            case 9:
                wy.a aVar10 = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                q qVar5 = fv.b.f28186a;
                return Boolean.valueOf(new File(fv.b.c(filePath, null, null)).exists());
            case 10:
                wy.a aVar11 = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                return Boolean.valueOf(new File(filePath).exists());
            case 11:
                wy.a aVar12 = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                q qVar6 = fv.b.f28186a;
                String lowerCase2 = filePath.toLowerCase(Locale.ROOT);
                m.e(lowerCase2, "toLowerCase(...)");
                return Boolean.valueOf(new File(fv.b.c(lowerCase2, null, null)).exists());
            case 12:
                wy.a aVar13 = wy.a.COROUTINE_SUSPENDED;
                ArrayList arrayListO = ep.a.o(obj);
                int i12 = 8;
                int i13 = 0;
                if (!oz.q.K0(filePath)) {
                    List listW0 = oz.q.W0(oz.q.i1(filePath).toString(), new String[]{";"}, 0, 6);
                    ArrayList arrayList = new ArrayList();
                    for (Object obj2 : listW0) {
                        if (!oz.q.K0((String) obj2)) {
                            arrayList.add(obj2);
                        }
                    }
                    arrayList.size();
                    int size = arrayList.size();
                    int i14 = 0;
                    while (i14 < size) {
                        int i15 = i14 + 1;
                        List listW1 = oz.q.W0(oz.q.i1((String) arrayList.get(i14)).toString(), new String[]{":"}, 0, 6);
                        ArrayList arrayList2 = new ArrayList();
                        for (Object obj3 : listW1) {
                            if (!oz.q.K0((String) obj3)) {
                                arrayList2.add(obj3);
                            }
                        }
                        if (arrayList2.size() > 1) {
                            try {
                                Integer numT0 = x.t0((String) arrayList2.get(0));
                                if (numT0 != null) {
                                    int iIntValue = numT0.intValue();
                                    List listW2 = oz.q.W0((CharSequence) arrayList2.get(1), new String[]{"_"}, 0, 6);
                                    ArrayList arrayList3 = new ArrayList();
                                    Iterator it = listW2.iterator();
                                    while (it.hasNext()) {
                                        Integer numT1 = x.t0((String) it.next());
                                        if (numT1 != null) {
                                            arrayList3.add(numT1);
                                        }
                                    }
                                    if (arrayList3.size() >= 2 && ((String) arrayList2.get(0)).length() == 8) {
                                        arrayListO.add(new Daily(iIntValue, ((Number) (arrayList3.size() > 0 ? arrayList3.get(0) : new Integer(0))).intValue(), ((Number) (1 < arrayList3.size() ? arrayList3.get(1) : new Integer(0))).intValue(), ((Number) (2 < arrayList3.size() ? arrayList3.get(2) : new Integer(0))).intValue(), ((Number) (3 < arrayList3.size() ? arrayList3.get(3) : new Integer(0))).intValue(), ((Number) (4 < arrayList3.size() ? arrayList3.get(4) : new Integer(0))).intValue(), ((Number) (5 < arrayList3.size() ? arrayList3.get(5) : new Integer(0))).intValue(), ((Number) (6 < arrayList3.size() ? arrayList3.get(6) : new Integer(0))).intValue(), ((Number) (7 < arrayList3.size() ? arrayList3.get(7) : new Integer(0))).intValue(), ((Number) (8 < arrayList3.size() ? arrayList3.get(8) : new Integer(0))).intValue(), ((Number) (9 < arrayList3.size() ? arrayList3.get(9) : new Integer(0))).intValue(), ((Number) (10 < arrayList3.size() ? arrayList3.get(10) : new Integer(0))).intValue(), ((Number) (11 < arrayList3.size() ? arrayList3.get(11) : new Integer(0))).intValue(), ((Number) (12 < arrayList3.size() ? arrayList3.get(12) : new Integer(0))).intValue(), 0, 0));
                                    }
                                }
                            } catch (NumberFormatException e8) {
                                e8.printStackTrace();
                            }
                        }
                        i14 = i15;
                    }
                }
                ArrayList arrayList4 = new ArrayList();
                int size2 = arrayListO.size();
                while (i13 < size2) {
                    Object obj4 = arrayListO.get(i13);
                    i13++;
                    if (String.valueOf(((Daily) obj4).getTime()).length() == 8) {
                        arrayList4.add(obj4);
                    }
                }
                return ry.m.S0(arrayList4, new ua.e(i12));
            case 13:
                wy.a aVar14 = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                return b0Var;
            case 14:
                wy.a aVar15 = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                q qVar7 = fv.b.f28186a;
                return Boolean.valueOf(new File(fv.b.c(filePath, null, null)).exists());
            case 15:
                wy.a aVar16 = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                Bitmap bitmapDecodeFile = BitmapFactory.decodeFile(filePath);
                if (bitmapDecodeFile != null) {
                    return bitmapDecodeFile;
                }
                throw new IllegalStateException("Cannot decode tips poster");
            default:
                wy.a aVar17 = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                q qVar8 = fv.b.f28186a;
                return Boolean.valueOf(new File(fv.b.b(filePath)).exists());
        }
    }
}
