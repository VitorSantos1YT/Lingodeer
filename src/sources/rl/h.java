package rl;

import androidx.lifecycle.lifecycle.viewmodel.anchor.hIIS.scqhIrGXy;
import bq.m;
import bq.r;
import cf.x;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.reflect.TypeToken;
import com.lingo.fluent.object.PdLessonDbHelper;
import com.lingo.lingoskill.LingoSkillApplication;
import com.lingo.lingoskill.http.model.FluentGetLessonSummaryWithIdsResponse;
import com.lingo.lingoskill.http.model.FluentGetOneLessonResponse;
import com.lingo.lingoskill.http.model.ProgressFluentLearnSyncResponse;
import com.lingo.lingoskill.object.PdLesson;
import com.lingo.lingoskill.object.PdSentence;
import com.lingo.lingoskill.object.PdTips;
import com.lingo.lingoskill.object.PdTipsDao;
import com.lingo.lingoskill.object.PdWord;
import com.lingo.lingoskill.object.SentenceDao;
import com.lingo.lingoskill.object.WordDao;
import com.lingo.lingoskill.ruskill.ui.learn.mr.OCBJEWZHh;
import com.lingodeer.network.model.ApiResponse;
import com.lingodeer.network.model.BooleanResponse;
import com.lingodeer.network.model.JsonResponse;
import com.lingodeer.network.model.ServerJsonResponse;
import dv.x0;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import nv.p;
import o20.t0;
import okhttp3.Response;
import qy.l;
import qy.q;
import ry.n;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final h f49283a = new h();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final q f49284b = com.bumptech.glide.d.v(new ns.d(28));

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f49285c = (a) x0.f24532b.b(a.class);

    public static hv.a f() {
        return (hv.a) f49284b.getValue();
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    public final Object a(String str, xy.c cVar) throws BadPaddingException, NoSuchPaddingException, IllegalBlockSizeException, NoSuchAlgorithmException, InvalidKeyException {
        b bVar;
        h hVar;
        List<PdTips> listK0;
        if (cVar instanceof b) {
            bVar = (b) cVar;
            int i11 = bVar.f49263c;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                bVar.f49263c = i11 - Integer.MIN_VALUE;
                hVar = this;
            } else {
                hVar = this;
                bVar = new b(hVar, cVar);
            }
        } else {
            hVar = this;
            bVar = new b(hVar, cVar);
        }
        b bVar2 = bVar;
        Object objG = bVar2.f49261a;
        wy.a aVar = wy.a.COROUTINE_SUSPENDED;
        int i12 = bVar2.f49263c;
        int i13 = 0;
        if (i12 == 0) {
            com.bumptech.glide.e.F(objG);
            JsonObject jsonObject = new JsonObject();
            jsonObject.addProperty("IDs", str);
            int[] iArr = r.f4959a;
            jsonObject.addProperty("lan", m.c());
            jsonObject.addProperty("appversion", "Android-".concat(m.d()));
            l lVarY = p.y(jsonObject, "toJson(...)", f());
            l lVar = (l) lVarY.f48496b;
            SecretKey secretKey = (SecretKey) lVar.f48495a;
            SecretKey secretKey2 = (SecretKey) lVar.f48496b;
            JsonObject jsonObject2 = (JsonObject) lVarY.f48495a;
            TypeToken<ServerJsonResponse<JsonResponse>> typeToken = new TypeToken<ServerJsonResponse<JsonResponse>>() { // from class: com.lingo.lingoskill.http.v2.FluentNetworkClientImp$fluentLessonDetailsWithIdsGet$2
            };
            c cVar2 = new c(jsonObject2, null, i13);
            bVar2.f49263c = 1;
            objG = hVar.g(secretKey, secretKey2, typeToken, cVar2, bVar2);
            if (objG == aVar) {
                return aVar;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.bumptech.glide.e.F(objG);
        }
        ApiResponse apiResponse = (ApiResponse) objG;
        if (!(apiResponse instanceof ApiResponse.Success)) {
            return i.a(apiResponse);
        }
        ry.r rVar = ry.r.f50854a;
        JsonObject asJsonObject = JsonParser.parseString(((JsonResponse) ((ApiResponse.Success) apiResponse).getData()).getJson()).getAsJsonObject();
        if (asJsonObject != null) {
            Iterator<String> it = asJsonObject.keySet().iterator();
            while (it.hasNext()) {
                String next = it.next();
                kotlin.jvm.internal.m.c(next);
                long j11 = Long.parseLong(next);
                JsonObject asJsonObject2 = asJsonObject.get(next).getAsJsonObject();
                JsonArray asJsonArray = asJsonObject2.getAsJsonArray(SentenceDao.TABLENAME);
                JsonArray asJsonArray2 = asJsonObject2.getAsJsonArray(WordDao.TABLENAME);
                JsonArray asJsonArray3 = asJsonObject2.getAsJsonArray("Knowledge");
                Object objFromJson = new Gson().fromJson(asJsonArray.toString(), (Class<Object>) PdSentence[].class);
                kotlin.jvm.internal.m.e(objFromJson, "fromJson(...)");
                List<PdSentence> listK1 = ry.l.k0((Object[]) objFromJson);
                ArrayList arrayList = new ArrayList(n.W(listK1, 10));
                for (PdSentence pdSentence : listK1) {
                    int[] iArr2 = r.f4959a;
                    LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
                    int i14 = x.n().keyLanguage;
                    Long sentenceId = pdSentence.getSentenceId();
                    kotlin.jvm.internal.m.e(sentenceId, "getSentenceId(...)");
                    pdSentence.setId(m.l(i14, sentenceId.longValue()));
                    pdSentence.setLan(m.k(x.n().keyLanguage));
                    arrayList.add(pdSentence);
                }
                Object objFromJson2 = new Gson().fromJson(asJsonArray2.toString(), (Class<Object>) PdWord[].class);
                kotlin.jvm.internal.m.e(objFromJson2, "fromJson(...)");
                List<PdWord> listK2 = ry.l.k0((Object[]) objFromJson2);
                ArrayList arrayList2 = new ArrayList(n.W(listK2, 10));
                for (PdWord pdWord : listK2) {
                    int[] iArr3 = r.f4959a;
                    LingoSkillApplication lingoSkillApplication2 = LingoSkillApplication.f21665b;
                    int i15 = x.n().keyLanguage;
                    Long wordId = pdWord.getWordId();
                    kotlin.jvm.internal.m.e(wordId, "getWordId(...)");
                    pdWord.setId(m.l(i15, wordId.longValue()));
                    pdWord.setLan(m.k(x.n().keyLanguage));
                    arrayList2.add(pdWord);
                }
                try {
                    String string = asJsonArray3.toString();
                    kotlin.jvm.internal.m.e(string, "toString(...)");
                    if (string.length() > 0) {
                        Object objFromJson3 = new Gson().fromJson(asJsonArray3.toString(), (Class<Object>) PdTips[].class);
                        kotlin.jvm.internal.m.e(objFromJson3, "fromJson(...)");
                        listK0 = ry.l.k0((Object[]) objFromJson3);
                    } else {
                        listK0 = rVar;
                    }
                } catch (Exception unused) {
                }
                ArrayList arrayList3 = new ArrayList(n.W(listK0, 10));
                for (PdTips pdTips : listK0) {
                    int[] iArr4 = r.f4959a;
                    LingoSkillApplication lingoSkillApplication3 = LingoSkillApplication.f21665b;
                    int i16 = x.n().keyLanguage;
                    Long cardId = pdTips.getCardId();
                    kotlin.jvm.internal.m.e(cardId, "getCardId(...)");
                    pdTips.setId(m.l(i16, cardId.longValue()));
                    pdTips.setLan(m.k(x.n().keyLanguage));
                    arrayList3.add(pdTips);
                }
                int size = arrayList3.size();
                int i17 = 0;
                while (i17 < size) {
                    Object obj = arrayList3.get(i17);
                    i17++;
                    PdTips pdTips2 = (PdTips) obj;
                    PdTipsDao pdTipsDao = PdLessonDbHelper.INSTANCE.pdTipsDao();
                    int[] iArr5 = r.f4959a;
                    LingoSkillApplication lingoSkillApplication4 = LingoSkillApplication.f21665b;
                    int i18 = x.n().keyLanguage;
                    Long cardId2 = pdTips2.getCardId();
                    kotlin.jvm.internal.m.e(cardId2, "getCardId(...)");
                    JsonObject jsonObject3 = asJsonObject;
                    ry.r rVar2 = rVar;
                    PdTips pdTips3 = (PdTips) pdTipsDao.load(m.l(i18, cardId2.longValue()));
                    if (pdTips3 != null) {
                        String lessonIds = pdTips3.getLessonIds();
                        kotlin.jvm.internal.m.e(lessonIds, "getLessonIds(...)");
                        List listW0 = oz.q.W0(lessonIds, new String[]{";"}, 0, 6);
                        ArrayList arrayList4 = new ArrayList();
                        for (Object obj2 : listW0) {
                            if (((String) obj2).length() > 0) {
                                arrayList4.add(obj2);
                            }
                        }
                        ArrayList arrayList5 = new ArrayList(n.W(arrayList4, 10));
                        int size2 = arrayList4.size();
                        int i19 = 0;
                        while (i19 < size2) {
                            Object obj3 = arrayList4.get(i19);
                            i19++;
                            arrayList5.add(Long.valueOf(Long.parseLong((String) obj3)));
                            pdTips3 = pdTips3;
                        }
                        PdTips pdTips4 = pdTips3;
                        if (arrayList5.contains(Long.valueOf(j11))) {
                            pdTips2.setLessonIds(pdTips4.getLessonIds());
                        } else {
                            pdTips2.setLessonIds(pdTips4.getLessonIds() + j11 + ";");
                        }
                    } else {
                        pdTips2.setLessonIds(";" + j11 + ";");
                    }
                    rVar = rVar2;
                    asJsonObject = jsonObject3;
                }
                JsonObject jsonObject4 = asJsonObject;
                ry.r rVar3 = rVar;
                ArrayList arrayList6 = new ArrayList(n.W(arrayList, 10));
                int size3 = arrayList.size();
                int i21 = 0;
                while (i21 < size3) {
                    Object obj4 = arrayList.get(i21);
                    i21++;
                    PdSentence pdSentence2 = (PdSentence) obj4;
                    pdSentence2.setLessonId(Long.valueOf(j11));
                    Long[] lArrV = ew.a.v(pdSentence2.getWordList());
                    kotlin.jvm.internal.m.e(lArrV, "parseIdLst(...)");
                    ArrayList arrayList7 = new ArrayList(lArrV.length);
                    int length = lArrV.length;
                    int i22 = 0;
                    while (i22 < length) {
                        Long l9 = lArrV[i22];
                        ArrayList arrayList8 = new ArrayList();
                        int i23 = size3;
                        int size4 = arrayList2.size();
                        Iterator<String> it2 = it;
                        int i24 = 0;
                        while (i24 < size4) {
                            int i25 = size4;
                            Object obj5 = arrayList2.get(i24);
                            int i26 = i24 + 1;
                            PdWord pdWord2 = (PdWord) obj5;
                            long j12 = j11;
                            pdWord2.setLessonId(Long.valueOf(j12));
                            if (kotlin.jvm.internal.m.a(pdWord2.getWordId(), l9)) {
                                arrayList8.add(obj5);
                            }
                            size4 = i25;
                            i24 = i26;
                            j11 = j12;
                        }
                        arrayList7.add((PdWord) arrayList8.get(0));
                        i22++;
                        size3 = i23;
                        it = it2;
                    }
                    pdSentence2.setWords(arrayList7);
                    arrayList6.add(pdSentence2);
                    size3 = size3;
                }
                arrayList.size();
                arrayList2.size();
                arrayList3.size();
                PdLessonDbHelper pdLessonDbHelper = PdLessonDbHelper.INSTANCE;
                pdLessonDbHelper.pdSentenceDao().insertOrReplaceInTx(arrayList);
                pdLessonDbHelper.pdWordDao().insertOrReplaceInTx(arrayList2);
                pdLessonDbHelper.pdTipsDao().insertOrReplaceInTx(arrayList3);
                asJsonObject = jsonObject4;
                it = it;
                rVar = rVar3;
            }
        }
        return new ApiResponse.Success(new BooleanResponse(true));
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public final Object c(JsonObject jsonObject, xy.c cVar) {
        e eVar;
        if (cVar instanceof e) {
            eVar = (e) cVar;
            int i11 = eVar.f49272c;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                eVar.f49272c = i11 - Integer.MIN_VALUE;
            } else {
                eVar = new e(this, cVar);
            }
        } else {
            eVar = new e(this, cVar);
        }
        e eVar2 = eVar;
        Object objG = eVar2.f49270a;
        Object obj = wy.a.COROUTINE_SUSPENDED;
        int i12 = eVar2.f49272c;
        if (i12 == 0) {
            com.bumptech.glide.e.F(objG);
            l lVarY = p.y(jsonObject, "toJson(...)", f());
            l lVar = (l) lVarY.f48496b;
            SecretKey secretKey = (SecretKey) lVar.f48495a;
            SecretKey secretKey2 = (SecretKey) lVar.f48496b;
            JsonObject jsonObject2 = (JsonObject) lVarY.f48495a;
            TypeToken typeToken = new TypeToken<ServerJsonResponse<FluentGetLessonSummaryWithIdsResponse>>() { // from class: com.lingo.lingoskill.http.v2.FluentNetworkClientImp$fluentLessonsGet$2
            };
            fz.c cVar2 = new c(jsonObject2, null, 2);
            eVar2.f49272c = 1;
            objG = g(secretKey, secretKey2, typeToken, cVar2, eVar2);
            if (objG == obj) {
                return obj;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.bumptech.glide.e.F(objG);
        }
        ApiResponse apiResponse = (ApiResponse) objG;
        if (!(apiResponse instanceof ApiResponse.Success)) {
            return i.a(apiResponse);
        }
        ApiResponse.Success success = (ApiResponse.Success) apiResponse;
        List<PdLesson> elements = ((FluentGetLessonSummaryWithIdsResponse) success.getData()).getElements();
        ArrayList arrayList = new ArrayList(n.W(elements, 10));
        for (PdLesson pdLesson : elements) {
            int[] iArr = r.f4959a;
            LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
            int i13 = x.n().keyLanguage;
            Long lessonId = pdLesson.getLessonId();
            kotlin.jvm.internal.m.e(lessonId, "getLessonId(...)");
            pdLesson.setId(m.l(i13, lessonId.longValue()));
            pdLesson.setLan(m.k(x.n().keyLanguage));
            arrayList.add(pdLesson);
        }
        return success.copy(((FluentGetLessonSummaryWithIdsResponse) success.getData()).copy(arrayList));
    }

    public final Object e(JsonObject jsonObject, jh.g gVar) {
        l lVarY = p.y(jsonObject, "toJson(...)", f());
        l lVar = (l) lVarY.f48496b;
        return g((SecretKey) lVar.f48495a, (SecretKey) lVar.f48496b, new TypeToken<ServerJsonResponse<ProgressFluentLearnSyncResponse>>() { // from class: com.lingo.lingoskill.http.v2.FluentNetworkClientImp$fluentProgressSync$2
        }, new c((JsonObject) lVarY.f48495a, null, 4), gVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object g(SecretKey secretKey, SecretKey secretKey2, TypeToken typeToken, fz.c cVar, xy.c cVar2) {
        g gVar;
        ApiResponse.Error error;
        if (cVar2 instanceof g) {
            gVar = (g) cVar2;
            int i11 = gVar.f49282f;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                gVar.f49282f = i11 - Integer.MIN_VALUE;
            } else {
                gVar = new g(this, cVar2);
            }
        } else {
            gVar = new g(this, cVar2);
        }
        Object objInvoke = gVar.f49280d;
        Object obj = wy.a.COROUTINE_SUSPENDED;
        int i12 = gVar.f49282f;
        try {
            if (i12 == 0) {
                com.bumptech.glide.e.F(objInvoke);
                gVar.f49277a = secretKey;
                gVar.f49278b = secretKey2;
                gVar.f49279c = typeToken;
                gVar.f49282f = 1;
                objInvoke = cVar.invoke(gVar);
                if (objInvoke == obj) {
                    return obj;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                typeToken = gVar.f49279c;
                secretKey2 = gVar.f49278b;
                secretKey = gVar.f49277a;
                com.bumptech.glide.e.F(objInvoke);
            }
            t0 t0Var = (t0) objInvoke;
            Response response = t0Var.f44598a;
            if (response.R) {
                String str = (String) t0Var.f44599b;
                if (str != null) {
                    try {
                        f().getClass();
                        ServerJsonResponse serverJsonResponse = (ServerJsonResponse) new Gson().fromJson(hv.a.b(str, secretKey, secretKey2), typeToken.getType());
                        if (serverJsonResponse.getStatus() == 0) {
                            try {
                                return new ApiResponse.Success(serverJsonResponse.getResult());
                            } catch (Exception unused) {
                                String error2 = serverJsonResponse.getError();
                                String json = new Gson().toJson(serverJsonResponse.getResult());
                                kotlin.jvm.internal.m.e(json, "toJson(...)");
                                error = new ApiResponse.Error(error2, 0, json, 2, null);
                            }
                        } else {
                            String error3 = serverJsonResponse.getError();
                            String json2 = new Gson().toJson(serverJsonResponse.getResult());
                            kotlin.jvm.internal.m.e(json2, "toJson(...)");
                            error = new ApiResponse.Error(error3, 0, json2, 2, null);
                        }
                    } catch (Exception e8) {
                        e8.printStackTrace();
                        error = new ApiResponse.Error("JsonSyntaxException", 0, null, 6, null);
                    }
                } else {
                    error = new ApiResponse.Error("Empty response", 0, null, 6, null);
                }
            } else {
                String str2 = response.f45160c;
                kotlin.jvm.internal.m.e(str2, "message(...)");
                error = new ApiResponse.Error(str2, t0Var.f44598a.f45161d, null, 4, null);
            }
        } catch (Exception e10) {
            e10.printStackTrace();
            String message = e10.getMessage();
            if (message == null) {
                message = "Unknown error";
            }
            error = new ApiResponse.Error(message, 0, null, 6, null);
        }
        return error;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public final Object b(JsonObject jsonObject, xy.c cVar) {
        d dVar;
        if (cVar instanceof d) {
            dVar = (d) cVar;
            int i11 = dVar.f49269c;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                dVar.f49269c = i11 - Integer.MIN_VALUE;
            } else {
                dVar = new d(this, cVar);
            }
        } else {
            dVar = new d(this, cVar);
        }
        d dVar2 = dVar;
        Object objG = dVar2.f49267a;
        Object obj = wy.a.COROUTINE_SUSPENDED;
        int i12 = dVar2.f49269c;
        int i13 = 1;
        if (i12 == 0) {
            com.bumptech.glide.e.F(objG);
            l lVarY = p.y(jsonObject, "toJson(...)", f());
            l lVar = (l) lVarY.f48496b;
            SecretKey secretKey = (SecretKey) lVar.f48495a;
            SecretKey secretKey2 = (SecretKey) lVar.f48496b;
            JsonObject jsonObject2 = (JsonObject) lVarY.f48495a;
            TypeToken typeToken = new TypeToken<ServerJsonResponse<FluentGetLessonSummaryWithIdsResponse>>() { // from class: com.lingo.lingoskill.http.v2.FluentNetworkClientImp$fluentLessonSummaryWithIdsGet$2
            };
            fz.c cVar2 = new c(jsonObject2, null, i13);
            dVar2.f49269c = 1;
            objG = g(secretKey, secretKey2, typeToken, cVar2, dVar2);
            if (objG == obj) {
                return obj;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.bumptech.glide.e.F(objG);
        }
        ApiResponse apiResponse = (ApiResponse) objG;
        if (!(apiResponse instanceof ApiResponse.Success)) {
            return i.a(apiResponse);
        }
        ApiResponse.Success success = (ApiResponse.Success) apiResponse;
        List<PdLesson> elements = ((FluentGetLessonSummaryWithIdsResponse) success.getData()).getElements();
        ArrayList arrayList = new ArrayList(n.W(elements, 10));
        for (PdLesson pdLesson : elements) {
            int[] iArr = r.f4959a;
            LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
            int i14 = x.n().keyLanguage;
            Long lessonId = pdLesson.getLessonId();
            kotlin.jvm.internal.m.e(lessonId, OCBJEWZHh.kRAXacdGYebqee);
            pdLesson.setId(m.l(i14, lessonId.longValue()));
            pdLesson.setLan(m.k(x.n().keyLanguage));
            arrayList.add(pdLesson);
        }
        return success.copy(((FluentGetLessonSummaryWithIdsResponse) success.getData()).copy(arrayList));
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    public final Object d(PdLesson pdLesson, xy.c cVar) throws BadPaddingException, NoSuchPaddingException, IllegalBlockSizeException, NoSuchAlgorithmException, InvalidKeyException {
        f fVar;
        h hVar;
        PdLesson pdLesson2;
        Object objG;
        if (cVar instanceof f) {
            fVar = (f) cVar;
            int i11 = fVar.f49276d;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                fVar.f49276d = i11 - Integer.MIN_VALUE;
                hVar = this;
            } else {
                hVar = this;
                fVar = new f(hVar, cVar);
            }
        } else {
            hVar = this;
            fVar = new f(hVar, cVar);
        }
        f fVar2 = fVar;
        Object obj = fVar2.f49274b;
        wy.a aVar = wy.a.COROUTINE_SUSPENDED;
        int i12 = fVar2.f49276d;
        if (i12 == 0) {
            com.bumptech.glide.e.F(obj);
            JsonObject jsonObject = new JsonObject();
            jsonObject.addProperty("eid", pdLesson.getLessonId());
            int[] iArr = r.f4959a;
            jsonObject.addProperty("lan", m.c());
            jsonObject.addProperty(scqhIrGXy.kPtXXQFSnK, "Android-".concat(m.d()));
            l lVarY = p.y(jsonObject, "toJson(...)", f());
            l lVar = (l) lVarY.f48496b;
            SecretKey secretKey = (SecretKey) lVar.f48495a;
            SecretKey secretKey2 = (SecretKey) lVar.f48496b;
            JsonObject jsonObject2 = (JsonObject) lVarY.f48495a;
            TypeToken<ServerJsonResponse<JsonResponse>> typeToken = new TypeToken<ServerJsonResponse<JsonResponse>>() { // from class: com.lingo.lingoskill.http.v2.FluentNetworkClientImp$fluentOneLessonGet$2
            };
            c cVar2 = new c(jsonObject2, null, 3);
            pdLesson2 = pdLesson;
            fVar2.f49273a = pdLesson2;
            fVar2.f49276d = 1;
            objG = hVar.g(secretKey, secretKey2, typeToken, cVar2, fVar2);
            if (objG == aVar) {
                return aVar;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            PdLesson pdLesson3 = fVar2.f49273a;
            com.bumptech.glide.e.F(obj);
            objG = obj;
            pdLesson2 = pdLesson3;
        }
        ApiResponse apiResponse = (ApiResponse) objG;
        if (!(apiResponse instanceof ApiResponse.Success)) {
            return i.a(apiResponse);
        }
        Iterable<PdTips> iterableK0 = ry.r.f50854a;
        JsonObject asJsonObject = JsonParser.parseString(((JsonResponse) ((ApiResponse.Success) apiResponse).getData()).getJson()).getAsJsonObject();
        if (asJsonObject != null) {
            JsonArray asJsonArray = asJsonObject.getAsJsonObject().getAsJsonArray(SentenceDao.TABLENAME);
            JsonArray asJsonArray2 = asJsonObject.getAsJsonObject().getAsJsonArray(WordDao.TABLENAME);
            JsonArray asJsonArray3 = asJsonObject.getAsJsonObject().getAsJsonArray("Knowledge");
            Object objFromJson = new Gson().fromJson(asJsonArray.toString(), (Class<Object>) PdSentence[].class);
            kotlin.jvm.internal.m.e(objFromJson, "fromJson(...)");
            List<PdSentence> listK0 = ry.l.k0((Object[]) objFromJson);
            ArrayList arrayList = new ArrayList(n.W(listK0, 10));
            for (PdSentence pdSentence : listK0) {
                int[] iArr2 = r.f4959a;
                LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
                int i13 = x.n().keyLanguage;
                Long sentenceId = pdSentence.getSentenceId();
                kotlin.jvm.internal.m.e(sentenceId, "getSentenceId(...)");
                pdSentence.setId(m.l(i13, sentenceId.longValue()));
                pdSentence.setLan(m.k(x.n().keyLanguage));
                arrayList.add(pdSentence);
            }
            Object objFromJson2 = new Gson().fromJson(asJsonArray2.toString(), (Class<Object>) PdWord[].class);
            kotlin.jvm.internal.m.e(objFromJson2, "fromJson(...)");
            List<PdWord> listK1 = ry.l.k0((Object[]) objFromJson2);
            ArrayList arrayList2 = new ArrayList(n.W(listK1, 10));
            for (PdWord pdWord : listK1) {
                int[] iArr3 = r.f4959a;
                LingoSkillApplication lingoSkillApplication2 = LingoSkillApplication.f21665b;
                int i14 = x.n().keyLanguage;
                Long wordId = pdWord.getWordId();
                kotlin.jvm.internal.m.e(wordId, "getWordId(...)");
                pdWord.setId(m.l(i14, wordId.longValue()));
                pdWord.setLan(m.k(x.n().keyLanguage));
                arrayList2.add(pdWord);
            }
            try {
                String string = asJsonArray3.toString();
                kotlin.jvm.internal.m.e(string, "toString(...)");
                if (string.length() > 0) {
                    Object objFromJson3 = new Gson().fromJson(asJsonArray3.toString(), (Class<Object>) PdTips[].class);
                    kotlin.jvm.internal.m.e(objFromJson3, "fromJson(...)");
                    iterableK0 = ry.l.k0((Object[]) objFromJson3);
                }
            } catch (Exception unused) {
            }
            ArrayList arrayList3 = new ArrayList(n.W(iterableK0, 10));
            for (PdTips pdTips : iterableK0) {
                int[] iArr4 = r.f4959a;
                LingoSkillApplication lingoSkillApplication3 = LingoSkillApplication.f21665b;
                int i15 = x.n().keyLanguage;
                Long cardId = pdTips.getCardId();
                kotlin.jvm.internal.m.e(cardId, "getCardId(...)");
                pdTips.setId(m.l(i15, cardId.longValue()));
                pdTips.setLan(m.k(x.n().keyLanguage));
                arrayList3.add(pdTips);
            }
            int size = arrayList3.size();
            int i16 = 0;
            int i17 = 0;
            while (i17 < size) {
                Object obj2 = arrayList3.get(i17);
                i17++;
                PdTips pdTips2 = (PdTips) obj2;
                PdTipsDao pdTipsDao = PdLessonDbHelper.INSTANCE.pdTipsDao();
                int[] iArr5 = r.f4959a;
                LingoSkillApplication lingoSkillApplication4 = LingoSkillApplication.f21665b;
                int i18 = x.n().keyLanguage;
                Long cardId2 = pdTips2.getCardId();
                kotlin.jvm.internal.m.e(cardId2, "getCardId(...)");
                PdTips pdTips3 = (PdTips) pdTipsDao.load(m.l(i18, cardId2.longValue()));
                if (pdTips3 != null) {
                    String lessonIds = pdTips3.getLessonIds();
                    kotlin.jvm.internal.m.e(lessonIds, "getLessonIds(...)");
                    List listW0 = oz.q.W0(lessonIds, new String[]{";"}, i16, 6);
                    ArrayList arrayList4 = new ArrayList();
                    for (Object obj3 : listW0) {
                        if (((String) obj3).length() > 0) {
                            arrayList4.add(obj3);
                        }
                    }
                    ArrayList arrayList5 = new ArrayList(n.W(arrayList4, 10));
                    int size2 = arrayList4.size();
                    int i19 = i16;
                    while (i19 < size2) {
                        Object obj4 = arrayList4.get(i19);
                        i19++;
                        arrayList5.add(Long.valueOf(Long.parseLong((String) obj4)));
                    }
                    if (arrayList5.contains(pdLesson2.getLessonId())) {
                        pdTips2.setLessonIds(pdTips3.getLessonIds());
                    } else {
                        pdTips2.setLessonIds(pdTips3.getLessonIds() + pdLesson2.getLessonId() + ";");
                    }
                } else {
                    pdTips2.setLessonIds(";" + pdLesson2.getLessonId() + ";");
                }
                i16 = 0;
            }
            ArrayList arrayList6 = new ArrayList(n.W(arrayList, 10));
            int size3 = arrayList.size();
            int i21 = 0;
            while (i21 < size3) {
                Object obj5 = arrayList.get(i21);
                i21++;
                PdSentence pdSentence2 = (PdSentence) obj5;
                pdSentence2.setLessonId(pdLesson2.getLessonId());
                Long[] lArrV = ew.a.v(pdSentence2.getWordList());
                kotlin.jvm.internal.m.e(lArrV, "parseIdLst(...)");
                ArrayList arrayList7 = new ArrayList(lArrV.length);
                int length = lArrV.length;
                int i22 = 0;
                while (i22 < length) {
                    Long l9 = lArrV[i22];
                    ArrayList arrayList8 = new ArrayList();
                    int size4 = arrayList2.size();
                    int i23 = size3;
                    int i24 = 0;
                    while (i24 < size4) {
                        int i25 = i21;
                        Object obj6 = arrayList2.get(i24);
                        int i26 = i24 + 1;
                        PdWord pdWord2 = (PdWord) obj6;
                        Long[] lArr = lArrV;
                        pdWord2.setLessonId(pdLesson2.getLessonId());
                        if (kotlin.jvm.internal.m.a(pdWord2.getWordId(), l9)) {
                            arrayList8.add(obj6);
                        }
                        i21 = i25;
                        i24 = i26;
                        lArrV = lArr;
                    }
                    arrayList7.add((PdWord) arrayList8.get(0));
                    i22++;
                    size3 = i23;
                    i21 = i21;
                }
                pdSentence2.setWords(arrayList7);
                arrayList6.add(pdSentence2);
                size3 = size3;
            }
            int i27 = 0;
            pdLesson2.setSentences(arrayList6);
            StringBuilder sb2 = new StringBuilder();
            int size5 = arrayList3.size();
            while (i27 < size5) {
                Object obj7 = arrayList3.get(i27);
                i27++;
                sb2.append(((PdTips) obj7).getCardId() + ";");
            }
            pdLesson2.setTipsIds(sb2.toString());
            PdLessonDbHelper pdLessonDbHelper = PdLessonDbHelper.INSTANCE;
            pdLessonDbHelper.pdLessonDao().insertOrReplace(pdLesson2);
            pdLesson2.setTips(arrayList3);
            pdLessonDbHelper.pdSentenceDao().insertOrReplaceInTx(arrayList);
            pdLessonDbHelper.pdWordDao().insertOrReplaceInTx(arrayList2);
            pdLessonDbHelper.pdTipsDao().insertOrReplaceInTx(arrayList3);
        }
        return new ApiResponse.Success(new FluentGetOneLessonResponse(pdLesson2));
    }
}
