package rb;

import android.database.Cursor;
import androidx.work.impl.WorkDatabase_Impl;
import cf.x;
import fb.l;
import fr.j3;
import hh.p0;
import java.util.ArrayList;
import kotlin.jvm.internal.m;
import ob.i;
import ob.j;
import ob.p;
import ob.u;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f49074a = 0;

    static {
        m.e(l.c("DiagnosticsWrkr"), "tagWithPrefix(\"DiagnosticsWrkr\")");
    }

    public static final void a(ob.l lVar, u uVar, i iVar, ArrayList arrayList) {
        StringBuilder sb2 = new StringBuilder("\n Id \t Class Name\t Job Id\t State\t Unique Name\t Tags\t");
        int size = arrayList.size();
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            p pVar = (p) obj;
            j jVarS = j3.s(pVar);
            String str = pVar.f44848a;
            ob.g gVarL = iVar.l(jVarS);
            Integer numValueOf = gVarL != null ? Integer.valueOf(gVarL.f44810c) : null;
            lVar.getClass();
            w9.u uVarB = w9.u.b(1, "SELECT name FROM workname WHERE work_spec_id=?");
            uVarB.l(1, str);
            WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) lVar.f44822b;
            workDatabase_Impl.b();
            Cursor cursorF = x.F(workDatabase_Impl, uVarB, false);
            try {
                ArrayList arrayList2 = new ArrayList(cursorF.getCount());
                while (cursorF.moveToNext()) {
                    arrayList2.add(cursorF.getString(0));
                }
                cursorF.close();
                uVarB.release();
                String strY0 = ry.m.y0(arrayList2, ",", null, null, null, 62);
                String strY1 = ry.m.y0(uVar.s(str), ",", null, null, null, 62);
                StringBuilder sbQ = p0.q("\n", str, "\t ");
                sbQ.append(pVar.f44850c);
                sbQ.append("\t ");
                sbQ.append(numValueOf);
                sbQ.append("\t ");
                sbQ.append(pVar.f44849b.name());
                sbQ.append("\t ");
                sbQ.append(strY0);
                sbQ.append("\t ");
                sbQ.append(strY1);
                sbQ.append('\t');
                sb2.append(sbQ.toString());
            } catch (Throwable th2) {
                cursorF.close();
                uVarB.release();
                throw th2;
            }
        }
        m.e(sb2.toString(), "StringBuilder().apply(builderAction).toString()");
    }
}
