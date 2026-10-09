package kv;

import com.stkouyu.util.CommandUtil;
import com.tbruyelle.rxpermissions3.BuildConfig;
import java.util.List;
import su.Mbl.tcppUUQxZjFdy;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final t0 f38818a = new t0();

    public static x a(String str, String str2) {
        n0 n0VarG = g(str);
        String str3 = n0VarG.f38785a;
        String str4 = n0VarG.f38786b;
        ry.r rVar = ry.r.f50854a;
        e0 e0Var = new e0(rVar, rVar, str3, str4, BuildConfig.VERSION_NAME);
        n0 n0VarG2 = g(str2);
        return new x(e0Var, new e0(rVar, rVar, n0VarG2.f38785a, n0VarG2.f38786b, BuildConfig.VERSION_NAME));
    }

    public static r b(String str, u0 u0Var, List list, List list2) {
        n0 n0VarG = g(str);
        return new r(new f0(n0VarG.f38785a, n0VarG.f38786b, u0Var, list, list2));
    }

    public static r c(String str, x0 x0Var) {
        n0 n0VarG = g(str);
        String str2 = n0VarG.f38785a;
        String str3 = n0VarG.f38786b;
        ry.r rVar = ry.r.f50854a;
        return new r(new f0(str2, str3, x0Var, rVar, rVar));
    }

    public static k0 d(String str, String str2, v0 v0Var, List list, List list2) {
        return new k0(str, str2, v0Var, ns.o.K(new z(new v0(oz.r.g0(str2)), list)), list2);
    }

    public static k0 e(String str, String str2, x0 x0Var, List list, List list2) {
        return new k0(str, str2, x0Var, ns.o.K(new z(new v0(oz.r.g0(str2)), list2)), list);
    }

    public static n0 g(String str) {
        List listW0 = oz.q.W0(str, new String[]{"/"}, 2, 2);
        int size = listW0.size();
        Object obj = BuildConfig.VERSION_NAME;
        String string = oz.q.i1((String) (size > 0 ? listW0.get(0) : BuildConfig.VERSION_NAME)).toString();
        if (1 < listW0.size()) {
            obj = listW0.get(1);
        }
        return new n0(string, oz.q.i1((String) obj).toString());
    }

    public static j h(String str) {
        return new j(str, false, null, 6);
    }

    public static j i(String str) {
        return new j(str, true, i.Primary);
    }

    public static v0 j(String str) {
        return new v0(oz.r.g0(str));
    }

    public static v k(t0 t0Var, u0 u0Var, a0 a0Var, int i11) {
        if ((i11 & 4) != 0) {
            a0Var = a0.Secondary;
        }
        return new v(u0Var, null, a0Var);
    }

    public static u0 l(y0 y0Var) {
        return new u0(y0Var, ry.r.f50854a, false);
    }

    public final List f() {
        u uVar = new u(l(y0.JpSyllableIntroL14P01));
        u uVar2 = new u(l(y0.JpSyllableIntroL14P02));
        r rVarC = c("しゅじん/shu ji n", l(y0.JpSyllableIntroL14ExampleNote01));
        r rVarB = b("しゅうじん/shu u ji n", l(y0.JpSyllableIntroL14ExampleNote02), ns.o.L(h("しゅ"), i("う"), h("じん")), ns.o.L(h(CommandUtil.COMMAND_SH), i("u u "), h("ji n")));
        u uVar3 = new u(l(y0.JpSyllableIntroL14P03));
        u uVar4 = new u(l(y0.JpSyllableIntroL14P04));
        u0 u0VarL = l(y0.JpSyllableIntroL14Subtitle01);
        a0 a0Var = a0.Primary;
        v vVarK = k(this, u0VarL, a0Var, 2);
        u uVar5 = new u(l(y0.JpSyllableIntroL14P05));
        v vVarK2 = k(this, l(y0.JpSyllableIntroL14Subtitle02), null, 6);
        r rVarB2 = b("おかあさん/o ka a sa n", l(y0.JpSyllableIntroL14ExampleNote03), ns.o.L(h("お"), i("かあ"), h("さん")), ns.o.L(h("o "), i("ka a"), h(" sa n")));
        v vVarK3 = k(this, l(y0.JpSyllableIntroL14Subtitle03), null, 6);
        r rVarB3 = b("うれしい/u re shi i", l(y0.JpSyllableIntroL14ExampleNote04), ns.o.L(h("うれ"), i("しい")), ns.o.L(h("u re "), i("shi i")));
        r rVarB4 = b("せいかつ/se i ka tsu", l(y0.JpSyllableIntroL14ExampleNote05), ns.o.L(i("せい"), h("かつ")), ns.o.L(i("se i"), h(" ka tsu")));
        v vVarK4 = k(this, l(y0.JpSyllableIntroL14Subtitle04), null, 6);
        r rVarB5 = b("くうき/ku u ki", l(y0.JpSyllableIntroL14ExampleNote06), ns.o.L(i("くう"), h("き")), ns.o.L(i("ku u"), h(" ki")));
        r rVarB6 = b("ほうりつ/ho u ri tsu", l(y0.JpSyllableIntroL14ExampleNote07), ns.o.L(i("ほう"), h("りつ")), ns.o.L(i("ho u"), h(" ri tsu")));
        u uVar6 = new u(l(y0.JpSyllableIntroL14P06));
        r rVarB7 = b("おねえさん/o ne e sa n", l(y0.JpSyllableIntroL14ExampleNote08), ns.o.L(h("お"), i("ねえ"), h("さん")), ns.o.L(h("o "), i("ne e"), h(" sa n")));
        r rVarB8 = b("おおきい/o o ki i", l(y0.JpSyllableIntroL14ExampleNote09), ns.o.L(i("おお"), h("きい")), ns.o.L(i("o o"), h(tcppUUQxZjFdy.JvX)));
        r rVarB9 = b("こおり/ko o ri", l(y0.JpSyllableIntroL14ExampleNote10), ns.o.L(i("こお"), h("り")), ns.o.L(i("ko o"), h(" ri")));
        v vVarK5 = k(this, l(y0.JpSyllableIntroL14Subtitle05), a0Var, 2);
        u uVar7 = new u(l(y0.JpSyllableIntroL14P07));
        u0 u0VarL2 = l(y0.JpSyllableIntroL14ExampleNote11);
        j jVarH = h("コ");
        i iVar = i.Primary;
        return ns.o.L(uVar, uVar2, rVarC, rVarB, uVar3, uVar4, vVarK, uVar5, vVarK2, rVarB2, vVarK3, rVarB3, rVarB4, vVarK4, rVarB5, rVarB6, uVar6, rVarB7, rVarB8, rVarB9, vVarK5, uVar7, b("コーヒー/ko o hi i", u0VarL2, ns.o.L(jVarH, new j("ー", false, iVar), h("ヒ"), new j("ー", false, iVar)), ns.o.L(h("k"), i("o o"), h(" h"), i("i i"))), b("セーター/se e ta a", l(y0.JpSyllableIntroL14ExampleNote12), ns.o.L(h("セ"), new j("ー", false, iVar), h("タ"), new j("ー", false, iVar)), ns.o.L(h("s"), i("e e"), h(" t"), i("a a"))), new t(l(y0.JpSyllableNoteTitle), l(y0.JpSyllableIntroL14Note01Content), ry.l.k0(new x[0])));
    }
}
