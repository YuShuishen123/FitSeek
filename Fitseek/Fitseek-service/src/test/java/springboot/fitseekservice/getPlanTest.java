package springboot.fitseekservice;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import springboot.fitseekservice.service.AICreatePlanService;

/**
 * @author Yu'S'hui'shen
 */
@SpringBootTest
public class getPlanTest {

    AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(FitseekPlanApplication.class);

    AICreatePlanService AICreatePlanService = context.getBean(AICreatePlanService.class);

    @Test
    public void testPlan() {
        String response = AICreatePlanService.createPlan("{\n" +
                "  \"user_physical_data\": {\n" +
                "    \"body_info\": {\n" +
                "      \"gender\": \"F\",\n" +
                "      \"age\": 20,\n" +
                "      \"height\": 165.50,\n" +
                "      \"weight\": 55.00,\n" +
                "      \"sport_hobbies\": [\"羽毛球\", \"瑜伽\"],\n" +
                "      \"exercise_frequency\": \"每周3-4次\",\n" +
                "      \"exercise_duration\": \"30-60分钟\"\n" +
                "    },\n" +
                "    \"physical_test\": {\n" +
                "      \"test_score\": 85.50,\n" +
                "      \"height\": 165.50,\n" +
                "      \"weight\": 55.00,\n" +
                "      \"run_50m\": 8.20,\n" +
                "      \"vital_capacity\": 3200,\n" +
                "      \"standing_jump\": 182,\n" +
                "      \"sit_and_reach\": 19.5,\n" +
                "      \"sit_ups\": 45,\n" +
                "      \"pull_ups\": null,\n" +
                "      \"run_800m\": 222,\n" +
                "      \"run_1000m\": null,\n" +
                "      \"test_time\": \"2025-04-20 09:00:00\"\n" +
                "    },\n" +
                "    \"exercise_plan\": {\n" +
                "      \"plan_name\": \"30天体测提升计划\",\n" +
                "      \"plan_type\": \"体侧成绩提升\",\n" +
                "      \"plan_goal\": \"体测总分达90分\",\n" +
                "      \"start_date\": \"2025-05-01\",\n" +
                "      \"end_date\": \"2025-05-30\"\n" +
                "    }\n" +
                "  }\n" +
                "}");

        System.out.println("response = " + response);
    }
}