package ju;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteTransactionListener;
import android.os.Bundle;
import android.os.CancellationSignal;
import androidx.lifecycle.SavedStateViewModelFactory;
import androidx.lifecycle.viewmodel.InitializerViewModelFactoryBuilder;
import b7.e0;
import com.google.api.Service;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.core.Path;
import com.lingo.lingoskill.LingoSkillApplication;
import com.lingo.lingoskill.billing.SubscriptionHelpActivity;
import com.lingo.switchlanguage.ui.SwitchLanguageActivity;
import g00.d1;
import h1.s1;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import km.a0;
import kotlin.KotlinNothingValueException;
import kotlin.jvm.internal.z;
import l1.h1;
import l1.t;
import l1.u;
import m0.x;
import mt.l5;
import ns.q;
import qx.p;
import qy.b0;
import rz.o0;
import uz.x0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class d implements fz.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f37364a;

    public /* synthetic */ d(int i11) {
        this.f37364a = i11;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, qy.h] */
    @Override // fz.a
    public final Object invoke() {
        Class<?> returnType;
        int i11 = this.f37364a;
        int i12 = 1;
        b0 b0Var = b0.f48488a;
        int i13 = 0;
        switch (i11) {
            case 0:
                throw new IllegalStateException("CompositionLocal LocalKeyLanguage not present");
            case 1:
                throw new IllegalStateException("CompositionLocal LocalIsExpandedScreen not present");
            case 2:
                s1 s1Var = f.f37367a;
                return Boolean.FALSE;
            case 3:
                return e0.e("type", "alphabet");
            case 4:
                return new a0();
            case 5:
                return e0.e("source", "index");
            case 6:
                u.b("Unexpected call to default provider");
                throw new KotlinNothingValueException();
            case 7:
                try {
                    Method declaredMethod = SQLiteDatabase.class.getDeclaredMethod("getThreadSession", null);
                    declaredMethod.setAccessible(true);
                    return declaredMethod;
                } catch (Throwable unused) {
                    return null;
                }
            case 8:
                try {
                    Method method = (Method) la.b.f39844d.getValue();
                    if (method == null || (returnType = method.getReturnType()) == null) {
                        return null;
                    }
                    Class cls = Integer.TYPE;
                    return returnType.getDeclaredMethod("beginTransaction", cls, SQLiteTransactionListener.class, cls, CancellationSignal.class);
                } catch (Throwable unused2) {
                    return null;
                }
            case 9:
                int i14 = SubscriptionHelpActivity.Q;
                return e0.e("source", "subscribe_service");
            case 10:
                return e0.e("source", "subscribe_service");
            case 11:
                int i15 = SwitchLanguageActivity.M;
                return b0Var;
            case 12:
                return new x(0, 0);
            case 13:
                return new SavedStateViewModelFactory();
            case 14:
                InitializerViewModelFactoryBuilder initializerViewModelFactoryBuilder = new InitializerViewModelFactoryBuilder();
                initializerViewModelFactoryBuilder.addInitializer(z.a(m9.b.class), new lt.d(6));
                return initializerViewModelFactoryBuilder.build();
            case 15:
                return d1.f("com.lingo.fluent.ui.compose.model.DifficultyLevel", mh.b.values());
            case 16:
                return new g00.d(d1.f("com.lingo.fluent.ui.compose.model.LessonCategory", mh.d.values()), 0);
            case 17:
                return d1.f("com.lingo.fluent.ui.compose.model.LessonStatus", mh.f.values());
            case 18:
                Bundle bundle = new Bundle();
                LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
                if (cf.x.n().deMFSwitch == 0) {
                    bundle.putString("type", "male");
                } else {
                    bundle.putString("type", "female");
                }
                return bundle;
            case 19:
                Bundle bundle2 = new Bundle();
                LingoSkillApplication lingoSkillApplication2 = LingoSkillApplication.f21665b;
                if (cf.x.n().esusMFSwitch == 0) {
                    bundle2.putString("type", "male");
                } else {
                    bundle2.putString("type", "female");
                }
                return bundle2;
            case 20:
                return new h1(0);
            case 21:
                return t.B(Boolean.FALSE);
            case 22:
                return new h1(0);
            case 23:
                return t.B(Boolean.FALSE);
            case Service.METRICS_FIELD_NUMBER /* 24 */:
                float f5 = l5.f41627a;
                return b0Var;
            case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                return b0Var;
            case Service.BILLING_FIELD_NUMBER /* 26 */:
                FirebaseDatabase firebaseDatabaseA = nl.d.a(null);
                firebaseDatabaseA.a();
                DatabaseReference databaseReferenceE = new DatabaseReference(firebaseDatabaseA.f18978c, Path.f19210d).e("users_public");
                LingoSkillApplication lingoSkillApplication3 = LingoSkillApplication.f21665b;
                nl.b bVar = new nl.b(p.h(databaseReferenceE.e(cf.x.n().uid).e("followings")), i12);
                yz.f fVar = o0.f50940a;
                return x0.w(bVar, yz.e.f58387a);
            case 27:
                FirebaseDatabase firebaseDatabaseA2 = nl.d.a(null);
                firebaseDatabaseA2.a();
                DatabaseReference databaseReferenceE2 = new DatabaseReference(firebaseDatabaseA2.f18978c, Path.f19210d).e("users_relations");
                LingoSkillApplication lingoSkillApplication4 = LingoSkillApplication.f21665b;
                nl.b bVar2 = new nl.b(p.h(databaseReferenceE2.e(cf.x.n().uid).e("followers")), i13);
                yz.f fVar2 = o0.f50940a;
                return x0.w(bVar2, yz.e.f58387a);
            case Service.MONITORING_FIELD_NUMBER /* 28 */:
                return d1.e("com.lingodeer.course.ai.CourseAnswerCorrectionCount", ns.b.values(), new String[]{"ZERO", "ONE", "MULTIPLE"}, new Annotation[][]{null, null, null});
            default:
                return q.Companion.serializer();
        }
    }
}
