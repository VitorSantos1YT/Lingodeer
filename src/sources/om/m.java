package om;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import bq.z;
import com.lingo.lingoskill.LingoSkillApplication;
import com.lingo.lingoskill.object.JPChar;
import com.lingo.lingoskill.object.JPCharDao;
import com.lingodeer.R;
import com.lingodeer.data.env.Env;
import fu.j0;
import hj.q6;
import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class m extends b {
    public Context H;
    public final JPCharDao K;
    public final ArrayList L;
    public CardView M;
    public JPChar N;
    public boolean O;
    public long P;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final nm.b f45622e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Env f45623f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final ArrayList f45624t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(nm.b bVar, Env mEnv, ArrayList arrayList) {
        super(0L);
        kotlin.jvm.internal.m.f(mEnv, "mEnv");
        this.f45622e = bVar;
        this.f45623f = mEnv;
        this.f45624t = arrayList;
        if (ij.d.f34419e == null) {
            synchronized (ij.d.class) {
                if (ij.d.f34419e == null) {
                    LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
                    kotlin.jvm.internal.m.c(lingoSkillApplication);
                    ij.d.f34419e = new ij.d(lingoSkillApplication);
                }
            }
        }
        kotlin.jvm.internal.m.c(ij.d.f34419e);
        this.K = ij.d.i();
        this.L = new ArrayList();
    }

    @Override // om.b
    public final fz.f c() {
        return k.f45617a;
    }

    @Override // om.b
    public final void e() {
        this.f45622e.f43850a.x(1);
        Context context = d().getContext();
        kotlin.jvm.internal.m.e(context, "getContext(...)");
        this.H = context;
        ta.a aVar = this.f45600c;
        kotlin.jvm.internal.m.c(aVar);
        TextView textView = ((q6) aVar).f33176d;
        JPChar jPChar = this.N;
        if (jPChar == null) {
            kotlin.jvm.internal.m.n("mModel");
            throw null;
        }
        textView.setText(jPChar.getDisplayLuoMa());
        ArrayList arrayList = this.L;
        Collections.shuffle(arrayList);
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            int iA = w4.c.a(i11, "rl_answer_");
            JPChar jPChar2 = (JPChar) arrayList.get(i11);
            View viewFindViewById = d().findViewById(iA);
            kotlin.jvm.internal.m.e(viewFindViewById, "findViewById(...)");
            CardView cardView = (CardView) viewFindViewById;
            cardView.setTag(jPChar2);
            z.b(cardView, new j0(this, cardView, jPChar2, 29));
            View viewFindViewById2 = cardView.findViewById(R.id.tv_middle);
            kotlin.jvm.internal.m.e(viewFindViewById2, "findViewById(...)");
            TextView textView2 = (TextView) viewFindViewById2;
            um.c.a(textView2);
            if (this.f45623f.isPing) {
                textView2.setText(jPChar2.getPing());
            } else {
                textView2.setText(jPChar2.getPian());
            }
        }
    }

    @Override // om.b
    public final void f() {
        ArrayList arrayList = this.f45624t;
        int size = arrayList.size();
        int i11 = 0;
        while (true) {
            ArrayList arrayList2 = this.L;
            if (i11 >= size) {
                Collections.shuffle(arrayList2);
                this.N = (JPChar) arrayList2.get(0);
                return;
            }
            Object obj = arrayList.get(i11);
            i11++;
            Object objLoad = this.K.load(Long.valueOf(((Number) obj).longValue()));
            kotlin.jvm.internal.m.e(objLoad, "load(...)");
            arrayList2.add(objLoad);
        }
    }
}
