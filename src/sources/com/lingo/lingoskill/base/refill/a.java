package com.lingo.lingoskill.base.refill;

import ay.g0;
import com.adjust.sdk.Constants;
import com.lingo.lingoskill.object.DaoSession;
import com.lingo.lingoskill.object.HwCharPartDao;
import com.lingo.lingoskill.object.LDCharacterDao;
import com.lingo.lingoskill.object.Model_Sentence_QADao;
import com.lingo.lingoskill.object.PhraseDao;
import java.io.File;
import java.io.FileOutputStream;
import java.nio.charset.Charset;
import java.util.List;
import o20.t0;
import qy.b0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class a implements tx.c, tx.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f21674a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f21675b;

    public /* synthetic */ a(Object obj, int i11) {
        this.f21674a = i11;
        this.f21675b = obj;
    }

    @Override // tx.c
    public void accept(Object obj) {
        switch (this.f21674a) {
            case 0:
                Boolean t6 = (Boolean) obj;
                kotlin.jvm.internal.m.f(t6, "t");
                c cVar = (c) this.f21675b;
                DaoSession daoSession = cVar.f21692c;
                HwCharPartDao hwCharPartDao = daoSession.getHwCharPartDao();
                g0 g0VarF = ((i) com.google.android.material.datepicker.d.i(i.class, "http://192.168.31.31:4242/AdminZG/", "create(...)")).s().f(g.V);
                dy.j jVar = ky.e.f38937b;
                g0VarF.k(jVar).g(px.b.a()).h(new f(hwCharPartDao, cVar, 4), b.f21681d);
                ((i) com.google.android.material.datepicker.d.i(i.class, "http://192.168.31.31:4242/AdminZG/", "create(...)")).m().f(g.W).k(jVar).g(px.b.a()).h(new f(daoSession.getHwTCharPartDao(), cVar, 5), b.f21683e);
                ((i) com.google.android.material.datepicker.d.i(i.class, "http://192.168.31.31:4242/AdminZG/", "create(...)")).p().f(g.U).k(jVar).g(px.b.a()).h(new f(daoSession.getHwCharGroupDao(), cVar, 3), b.f21679c);
                break;
            case 1:
                Boolean t8 = (Boolean) obj;
                kotlin.jvm.internal.m.f(t8, "t");
                c cVar2 = (c) this.f21675b;
                ((i) com.google.android.material.datepicker.d.i(i.class, "http://192.168.31.31:1818/AdminCN/", "create(...)")).u().f(g.S).k(ky.e.f38937b).g(px.b.a()).h(new f(cVar2.f21692c.getJPCharPartDao(), cVar2, 7), b.f21688t);
                break;
            default:
                Boolean t11 = (Boolean) obj;
                kotlin.jvm.internal.m.f(t11, "t");
                c cVar3 = (c) this.f21675b;
                ((i) com.google.android.material.datepicker.d.i(i.class, "http://192.168.31.31:1717/AdminZG/", "create(...)")).u().f(g.S).k(ky.e.f38937b).g(px.b.a()).h(new f(cVar3.f21692c.getKOCharPartDao(), cVar3, 9), b.K);
                break;
        }
    }

    @Override // tx.d
    public Object apply(Object obj) {
        byte[] bytes;
        switch (this.f21674a) {
            case 3:
                List it = (List) obj;
                kotlin.jvm.internal.m.f(it, "it");
                LDCharacterDao lDCharacterDao = (LDCharacterDao) this.f21675b;
                lDCharacterDao.deleteAll();
                lDCharacterDao.insertOrReplaceInTx(it);
                return b0.f48488a;
            case 4:
                List it2 = (List) obj;
                kotlin.jvm.internal.m.f(it2, "it");
                PhraseDao phraseDao = (PhraseDao) this.f21675b;
                phraseDao.deleteAll();
                phraseDao.insertOrReplaceInTx(it2);
                return b0.f48488a;
            case 5:
                List it3 = (List) obj;
                kotlin.jvm.internal.m.f(it3, "it");
                Model_Sentence_QADao model_Sentence_QADao = (Model_Sentence_QADao) this.f21675b;
                model_Sentence_QADao.deleteAll();
                model_Sentence_QADao.insertOrReplaceInTx(it3);
                return b0.f48488a;
            default:
                t0 it4 = (t0) obj;
                String str = (String) this.f21675b;
                kotlin.jvm.internal.m.f(it4, "it");
                String str2 = (String) it4.f44599b;
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream(str);
                    if (str2 != null) {
                        try {
                            Charset charsetForName = Charset.forName(Constants.ENCODING);
                            kotlin.jvm.internal.m.e(charsetForName, "forName(...)");
                            bytes = str2.getBytes(charsetForName);
                            kotlin.jvm.internal.m.e(bytes, "getBytes(...)");
                        } catch (Throwable th2) {
                            try {
                                throw th2;
                            } catch (Throwable th3) {
                                ns.o.m(fileOutputStream, th2);
                                throw th3;
                            }
                        }
                    } else {
                        bytes = null;
                    }
                    fileOutputStream.write(bytes);
                    fileOutputStream.close();
                } catch (Exception e8) {
                    e8.printStackTrace();
                    new File(str).delete();
                }
                return Boolean.TRUE;
        }
    }
}
