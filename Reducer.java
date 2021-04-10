
import java.io.IOException;

import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Reducer;
import org.apache.hadoop.mapreduce.Reducer.Context;

public class WordCountReducer extends Reducer<Text, IntWritable, Text, IntWritable>{

	//Text Apple,Banana,Grapes;
	@Override
	public void reduce(Text key, Iterable<IntWritable> values, Context context)
	throws IOException, InterruptedException {
		int y = 0;
		for(IntWritable x : values)
		{
			y ++;
			
		}
		//if(key==Apple||key==Banana||key==Grapes){
			
			context.write(key, new IntWritable(y) );
		//}
		
		
	}

}
