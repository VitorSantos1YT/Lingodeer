package jr;

import android.content.Intent;
import com.lingo.lingoskill.ui.base.LoginActivity;
import com.lingo.story.ui.StoryActivity;
import com.lingodeer.data.model.INTENTS;
import com.tbruyelle.rxpermissions3.BuildConfig;
import fr.o0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class b implements fz.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f36576a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ StoryActivity f36577b;

    public /* synthetic */ b(StoryActivity storyActivity, int i11) {
        this.f36576a = i11;
        this.f36577b = storyActivity;
    }

    @Override // fz.a
    public final Object invoke() {
        int i11;
        int i12 = this.f36576a;
        qy.b0 b0Var = qy.b0.f48488a;
        StoryActivity storyActivity = this.f36577b;
        switch (i12) {
            case 0:
                int i13 = StoryActivity.N;
                int i14 = ((o0) storyActivity.l()).f27733a.keyLanguage;
                if (i14 == 22) {
                    i11 = 27;
                } else if (i14 != 40) {
                    i11 = 25;
                    if (i14 != 48) {
                        switch (i14) {
                            case 14:
                            case 16:
                                break;
                            case 15:
                            case 17:
                                i11 = 26;
                                break;
                            default:
                                i11 = 0;
                                break;
                        }
                    }
                } else {
                    i11 = 30;
                }
                return Integer.valueOf(storyActivity.getIntent().getIntExtra(INTENTS.EXTRA_INT, 1) + i11);
            case 1:
                int i15 = StoryActivity.N;
                storyActivity.finish();
                return b0Var;
            case 2:
                int i16 = StoryActivity.N;
                storyActivity.finish();
                return b0Var;
            case 3:
                int i17 = StoryActivity.N;
                Intent intent = new Intent(storyActivity, (Class<?>) LoginActivity.class);
                intent.putExtra(INTENTS.EXTRA_INT, 7);
                storyActivity.startActivity(intent);
                return b0Var;
            case 4:
                int i18 = StoryActivity.N;
                return Long.valueOf(storyActivity.getIntent().getLongExtra(INTENTS.EXTRA_LONG, 1L));
            case 5:
                int i19 = StoryActivity.N;
                storyActivity.finish();
                return b0Var;
            case 6:
                int i21 = StoryActivity.N;
                storyActivity.finish();
                return b0Var;
            case 7:
                int i22 = StoryActivity.N;
                String stringExtra = storyActivity.getIntent().getStringExtra(INTENTS.EXTRA_STRING);
                return stringExtra == null ? BuildConfig.VERSION_NAME : stringExtra;
            default:
                int i23 = StoryActivity.N;
                return new a20.a(2, ry.l.l0(new Object[]{Integer.valueOf(storyActivity.p())}));
        }
    }
}
